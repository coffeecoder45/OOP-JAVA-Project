//Qno8
public class Number {
    int x,y,z;
    Number(int x,int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int getMax(){
        if (x>y&&x>z){
            return x;
        } else if (y>x&&y>z) {
            return y;
        }
        else {
            return z;
        }
    }

    public static void main(String[] args) {
        Number number = new Number(12,23,32);
        System.out.println("Largest number is :"+number.getMax());
    }
}
