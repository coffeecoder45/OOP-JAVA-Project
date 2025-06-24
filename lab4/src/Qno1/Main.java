package Qno1;

import Qno1.Result;

public class Main {
    public static void main (String[] args) {
       Result student = new Result();
       student.read(1);
       student.display();
       student.readMark(45,66);
       student.displayMark();
       student.calculate();
       student.displayTotal();
    }
}