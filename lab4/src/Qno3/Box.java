package Qno3;

public class Box {
    float length,breadth,height;

    public Box(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void getVolume(){
        float v = length*breadth*height;
        System.out.println("The volume is "+v);
    }


}
