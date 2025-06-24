//Qno1
    public class Triangle {
        int a, b, c;

        // Constructor without parameters
        public Triangle() {
            a = 3;
            b = 4;
            c = 5;
        }

        // Method to calculate perimeter
        public int getPerimeter() {
            return a + b + c;
        }

        // Method to calculate area using Heron's formula
        public double getArea() {
            double s = getPerimeter() / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public static void main(String[] args) {
            Triangle t = new Triangle();
            System.out.println("Perimeter: " + t.getPerimeter());
            System.out.println("Area: " + t.getArea());
        }
    }

