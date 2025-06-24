package Qno3;

public class BoxWeight extends Box{
    float weight;
    public BoxWeight(float length, float breadth, float height) {
        super(length, breadth, height);
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void getWeight(){
        System.out.println("The weight is :"+weight);
    }
}
