package Qno2;

import java.util.Scanner;

public class AirMain {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Airplane airplane  = new Airplane();
        System.out.println("Enter code");
        String code = scanner.next();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter capacity");
        int capacity = scanner.nextInt();
        airplane.getData(code,name,capacity);
        airplane.putData();
    }
}
