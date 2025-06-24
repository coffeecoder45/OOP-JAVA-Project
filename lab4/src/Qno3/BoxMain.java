package Qno3;

public class BoxMain {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(12,32,45);
        boxWeight.getVolume();
        boxWeight.setWeight(50);
        boxWeight.getWeight();
        BoxWeight boxWeight1 = new BoxWeight(45,12,66);
        boxWeight1.getVolume();
        boxWeight1.setWeight(33);
        boxWeight1.getWeight();
    }
}
