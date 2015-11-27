 #include <EEPROM.h>

const int exteriorButtonPins[] = {1,2,3,4,5,6};
const int interiorButtonPins[] = {1,2,3,4,5,6};

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
const unsigned long TIME_BETWEEN_FLOORS = 1000;

boolean areDoorsClosed = true;
boolean doorTimerLock = false;
unsigned long doorTimer;
const unsigned long TIME_OPEN_DOORS = 5000;

void setup () {
    Serial.begin (9600);
    setupInteriorButtons ();
    setupExteriorButtons ();
    returnToGround();
}

void loop () {
  
    if (!halt) {
        if(hasReachedFloor()) {
        	floorReachedEvent(); 
        	if (shouldStopAtFloor(currentFloor)) {
            	doors();
            	if (areDoorsClosed) {
            		stopElevator();
            		markFloorAsVisited(currentFloor);
            	}  
        	} 
        	executeTask();
        }
    }
    if (buttonPressDetected()) executeTask ();
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
      halt = false;
      currentDirection ? motorUp() : motorDown();
      timeAtStarted = millis();
}

void changeDirection () {
      currentDirection = !currentDirection;
}

void returnToGround(){
  if (!EEPROM.read(1)) {
    for (int i = 0; i < EEPROM.read(1); ++i)
    {
      motorDown();
      delay(1000);
    }
  }
}

/**
    Hace que el ascensor se mueva al siguiente piso que tiene que visitar
*/
void executeTask(){
    if (taskInDirection(currentDirection))
          startElevator();
    else if (taskInDirection (!currentDirection)) {
    	  //Si hay tareas en sentido contrario, ir para allá
          changeDirection();
          startElevator();
   }
}

/**
  Devuelve verdadero si hay un piso a visitar en la dirección
*/
boolean taskInDirection(boolean pcurrentDirection) {
    for (int i = currentFloor; pcurrentDirection ? i < NUM_FLOORS : i >= 0; i = pcurrentDirection ? i + 1 : i - 1)
    {
        if (shouldStopAtFloor(i)) return true;
    }
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
        if (millis() - doorTimer >= TIME_OPEN_DOORS) {
                Serial.println("DoorClose");
                doorTimerLock = false;
                areDoorsClosed = true;
        }
}

//Returns true if a button press is detected
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
  Returns true if an interior button selection for the floor at index specified was made or an 
  exterior button that is in the same direction as the current floors direction has been selected.
*/
boolean shouldStopAtFloor (int floorIndex) {
     return interiorSelected[floorIndex] || exteriorSelected[floorIndex];
}

boolean hasReachedFloor() {
	if (millis() - timeAtStarted > TIME_BETWEEN_FLOORS) return true;
	return false;
}

/**
    Increments or decrements floorReached variable depending on direction of the elevator
    Ensures that the floor is marked as visited by deactivating its floor visited commands
    Returns false if the elevator is at the top or bottomFloor
*/
    void floorReachedEvent() {
      if (currentDirection) {
        if (currentFloor < MAX_FLOOR_INDEX) {
          currentFloor++;
          EEPROM.write(1, currentFloor);
        } else {
              //llegue a planta alta
        }
      } else {
        if (currentFloor > MIN_FLOOR_INDEX) {
          currentFloor--;
          EEPROM.write(1, currentFloor);
        } else {
              //legue a planta baja
        }
      }
    }

void markFloorAsVisited (int floorIndex) {
    interiorSelected[floorIndex] = false;
    exteriorSelected[floorIndex] = false;
    Serial.print("v");
    Serial.println(floorIndex);
}