package Qno2;

public class Airplane extends Fmachine {
String code,name;
int capacity;
    @Override
    void getData(String code, String name,int capacity) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    void putData() {
        System.out.println("The code is :"+ code);
        System.out.println("The name is :"+name);
        System.out.println("The capacity is :"+capacity);
    }
}
