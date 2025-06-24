//Qno7
public class Rectangle {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double Area(){
        return length * breadth;
    }
    void display(){
        System.out.println("Area is"+Area());
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,4);
        Rectangle rectangle2 = new Rectangle(3,4);
        double area1 = rectangle1.Area();
        double area2 = rectangle2.Area();
        System.out.println("rectangle 1 : "+rectangle1);
        System.out.println("rectangle 2 : "+rectangle2);
        System.out.println("Area of rectangle1 : "+area1);
        System.out.println("Area of rectangle2 : "+area2);
        if(area1>area2){
            System.out.println("rectangle 1 has larger area "+area1);
        }else {
            System.out.println("rectangle 2 has larger area "+area2);
        }
    }
}
