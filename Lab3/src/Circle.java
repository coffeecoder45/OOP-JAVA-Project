//Qno5
public class Circle {
    double radius;

    Circle(){
        radius = 1;
    }
    Circle(double radius){
        this.radius = radius;
    }
void circumOfCircle(){
    double circm = 2*(22/7)*radius;
    System.out.println("the circum is : "+circm);
}

    public static void main(String[] args) {
        Circle circle = new Circle();
circle.circumOfCircle();
    Circle circle1 = new Circle(2.3);
    circle1.circumOfCircle();
    }

}
