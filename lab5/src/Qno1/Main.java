package Qno1;

public class Main {
    public static void main(String[] args) {
       Calc calc = new Calc();
      int add =  calc.add(32,56);
        System.out.println("The sum is :"+add);
        int diff = calc.diff(45,12);
        System.out.println("The diff is :"+diff);
    }
}