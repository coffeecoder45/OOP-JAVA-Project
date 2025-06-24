package Qno1;

public class Result extends Test {
   int total;

   void calculate(){
       total = mark1+mark2;
   }
   void displayTotal(){
       System.out.println("The total mark is :"+ total);
   }
}
