package Qno4;

public class Manager extends Member{
    String department;

    public void setDepartment(String department){
        this.department = department;
    }
    public void printDepartment(){
        System.out.println("Department :"+department);
    }
}
