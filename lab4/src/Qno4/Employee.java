package Qno4;

public class Employee extends Member{
    String specialization;
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void printSpecialization(){
        System.out.println("Specialization : "+specialization);
    }
}
