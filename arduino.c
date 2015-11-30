#include <EEPROM.h>

const int exteriorButtonPins[] = {A0,A1,A2,A3,A4,A5};
const int interiorButtonPins[] = {2,3,4,5,6,7};

const int NUM_INTERIOR = 6;
const int NUM_EXTERIOR = 6;
boolean interiorSelected[] = {false,false,false,false,false,false};
boolean exteriorSelected[] = {false,false,false,false,false,false};

int currentFloor = 0;

const int MAX_FLOOR_INDEX = 5;
const int MIN_FLOOR_INDEX = 0;
const int NUM_FLOORS = 6;

boolean currentDirection = true; // true arriba, false abajo
boolean halt = true;

unsigned long timeAtStarted;
const unsigned long TIME_BETWEEN_FLOORS = 3000;

boolean areDoorsClosed = true;
boolean doorTimerLock = false;
unsigned long doorTimer;
const unsigned long TIME_OPEN_DOORS = 5000;

void setup () {
  Serial.begin (9600);
  setupInteriorButtons ();
  setupExteriorButtons ();
  returnToGround();
  //Serial.print("EEPROM: ");
  //Serial.println(EEPROM.read(1));
}

void loop () {
  if (!halt && areDoorsClosed) {
      if(hasReachedFloor()) {
        floorReachedEvent(); 
        if (shouldStopAtFloor(currentFloor)) {
            Serial.println("debe parar aca");
            stopElevator();
            markFloorAsVisited(currentFloor);
            doorOpen();   
        } else {Serial.println("no tiene que parar en este piso");}
        if (areDoorsClosed) executeTask();
      }
  }
  doorClose();
  if (buttonPressDetected() && areDoorsClosed && halt) executeTask ();
}

void motorUp() {
  Serial.println("MotorUp");
}

void motorDown() {
  Serial.println("MotorDown");
}

void motorStop() {
  Serial.println("MotorStop");
}

void stopElevator() {
  halt = true;
  motorStop();    
}

void startElevator () {
  Serial.println("Start Elevator");
  halt = false;
  currentDirection ? motorUp() : motorDown();
  timeAtStarted = millis();
  Serial.println(timeAtStarted);
}

void changeDirection () {
  currentDirection = !currentDirection;
}

void returnToGround(){
  currentFloor = EEPROM.read(1);
  if (currentFloor != 0) {
    doorClose();
    for (int i = 0; i < EEPROM.read(1); ++i)
    {
      motorDown();
      currentFloor--;
      delay(TIME_BETWEEN_FLOORS);
    }
    EEPROM.write(1,0);
  }
}

/**
    Hace que el ascensor se mueva al siguiente piso que tiene que visitar
*/
void executeTask(){
  Serial.println("executeTask");
  if (!exteriorSelected[currentFloor]) {     
    if (taskInDirection(currentDirection)) {
      Serial.println("quedan pisos por visitar en esta dirección");
      startElevator();
    } else if (taskInDirection (!currentDirection)) {
      //Si hay tareas en sentido contrario, ir para allá
      changeDirection();
      startElevator();
    }
  } else {
    Serial.println("viene por dooropen");
    doorOpen();
  }
}

/**
  Devuelve verdadero si hay un piso a visitar en la dirección
*/
boolean taskInDirection(boolean pcurrentDirection) {
  for (int i = currentFloor;
      pcurrentDirection ? i < NUM_FLOORS : i >= 0;
      i = pcurrentDirection ? i + 1 : i - 1)
    if (shouldStopAtFloor(i)) return true;
  return false;
}

void setupExteriorButtons () {
  for (int i = 0; i < NUM_EXTERIOR; i++)
    pinMode (exteriorButtonPins[i], INPUT);
}

void setupInteriorButtons () {
  for (int i = 0 ; i < NUM_INTERIOR; i++)
    pinMode (interiorButtonPins[i], INPUT);
}

void doors() {
  doorOpen(); doorClose();
}
 
void doorOpen() {
  areDoorsClosed = false;
  if (!doorTimerLock) {
    Serial.println("DoorOpen");
    doorTimer = millis();
    doorTimerLock = true;
  }
}
 
void doorClose() {
  if (doorTimerLock && millis() - doorTimer >= TIME_OPEN_DOORS) {
    Serial.println("DoorClose");
    doorTimerLock = false;
    areDoorsClosed = true;
    markFloorAsVisited(currentFloor);
    executeTask();                
  }        
}

//Devuelve true si se presiona un boton
boolean buttonPressDetected () {
  return (readExteriorButtonStates ()
    || readInteriorButtonStates ());
}

/* 
*  CORREGIMOS ESTO, SI 
*  TIRA ERROR DEBUGGEAR
*  ACÁ PRIMERO
*/
boolean readExteriorButtonStates() {
  //Serial.println("leeex");
  for (int i = 0 ; i < NUM_EXTERIOR; i++) {
    if (digitalRead(exteriorButtonPins[i]) == HIGH && !exteriorSelected[i]) {
      exteriorSelected[i] = true;
      Serial.print("e");
      Serial.println(i);
      return true;
    }     
  }
  return false;
}

/* 
*  CORREGIMOS ESTO, SI 
*  TIRA ERROR DEBUGGEAR
*  ACÁ PRIMERO
*/
boolean readInteriorButtonStates() {
  //Serial.println("leein");  
  for (int i = 0 ; i < NUM_INTERIOR; i++)  {
    if (i != currentFloor) {
      if(digitalRead(interiorButtonPins[i]) == HIGH && !interiorSelected[i]) {
        interiorSelected[i] = true;
        Serial.print("i");
        Serial.println(i);
        return true;
      }
    }
  }
  return false;
}

/**
  Devuelve true si tiene que parar en el piso,
  o sea, si se apreto un boton de adentro o afuera
*/
boolean shouldStopAtFloor (int floorIndex) {
  if (interiorSelected[floorIndex] || exteriorSelected[floorIndex]) {
    Serial.print("debe parar en ");
    Serial.println(floorIndex);
  }
  return interiorSelected[floorIndex] || exteriorSelected[floorIndex];
}

boolean hasReachedFloor() {
  if (millis() - timeAtStarted > TIME_BETWEEN_FLOORS) {
    Serial.println("LLego al siguiente piso");
    return true;
  }
  return false;
}

/**
    Aumenta o decrementa currentFloor en función de la trayectoria
*/
void floorReachedEvent() {
  Serial.println("floorReachedEvent");
  if (areDoorsClosed){
    if (currentDirection) {
      if (currentFloor < MAX_FLOOR_INDEX) {
        currentFloor++;
        Serial.println(currentFloor);
        EEPROM.write(1, currentFloor);
      } else {
        //llegue a planta alta
      }
    } else {
      if (currentFloor > MIN_FLOOR_INDEX) {
        currentFloor--;
        Serial.println(currentFloor);
        EEPROM.write(1, currentFloor);
      } else {
        //legue a planta baja
      }
    }
  }
}

void markFloorAsVisited (int floorIndex) {
  interiorSelected[floorIndex] = false;
  exteriorSelected[floorIndex] = false;
  Serial.print("v");
  Serial.println(floorIndex);
}
