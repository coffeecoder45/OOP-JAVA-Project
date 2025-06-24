package Qno3;

public class Rectangle implements Shape{
    float length,breadth,area;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getData() {
        area = length*breadth;
    }

    @Override
    public void displayArea() {
        System.out.println("The area of Rectangle is :"+area);
    }
}
