package Qno3;

public class Square implements Shape{
    float length,area;

    public Square(float length) {
        this.length = length;
    }

    @Override
    public void getData() {
        area = length*length;
    }

    @Override
    public void displayArea() {
        System.out.println("The area of square :"+area);
    }
}
