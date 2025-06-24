package Qno4;

public class Member {
    String name,address;
    Long age,phone,salary;

    public void setMemberDetails(String name,String address,Long age,Long phone,Long salary){
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }
    public void printMemberDetails(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
        System.out.println("Phone is :"+phone);
        System.out.println("Salary is :"+salary);
    }
}
