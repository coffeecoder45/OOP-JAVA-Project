//Qno3
public class Car {
    String carModel;
    String carName;
    String carOwner;
    Long carPrice;

    public void setCarInfo(){
        this.carModel = "23aa5D";
        this.carName = "bugati";
        this.carOwner = "Ramlal";
        this.carPrice = 3330003L;
    }
    void display(){
        System.out.println("Car Name : "+carName);
        System.out.println("Car Model : "+carModel);
        System.out.println("Car Owner :"+carOwner);
        System.out.println("Car price :"+carPrice+"$");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setCarInfo();
        car.display();
    }

}
