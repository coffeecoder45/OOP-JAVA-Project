package Qno1;

import Qno1.Student;

public class Test extends Student {
int mark1 ,mark2;
void readMark(int m1 , int m2){
this.mark1 = m1;
this.mark2 = m2;
}
void displayMark(){
    System.out.println("mark 1 is :"+mark1);
    System.out.println("mark 2 is :"+mark2);
}
}
