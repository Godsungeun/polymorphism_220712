public class VehicleTest {
     public static void main(String[] args){
         Car car = new Car();
         Vehicle vehicle = (Vehicle) car; // Car 타입이었던 car를 상위클래스 Vehicle 타입으로 변환(괄호생략가능)하여 vehicle에 넣음
         Car car2 = (Car) vehicle; //하위클래스 Car 타입으로 변환(생략불가능)
         // MotorBike motorBike = (MotorBike) car; // 상속 관계 아니므로 타입변환 불가 ->에러발생
     }
}

class Vehicle {
    String model;
    String color;
    int wheels;

    void startEngine(){
        System.out.println("시동 걸기");
    }
    void accelerate(){
        System.out.println("속도 올리기");
    }
    void brake() {
        System.out.println("브레이크!");
    }
}
class Car extends Vehicle {
    void giveRide(){
        System.out.println("다른 사람 태우기");
    }
}
class MotorBike extends Vehicle{
    void performance(){
        System.out.println("묘기 부리기");
    }
}