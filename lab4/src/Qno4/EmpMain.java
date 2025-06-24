package Qno4;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setMemberDetails("Abijit","chabahil",20L,9818787429L,20000L);
        employee.setSpecialization("Backend");
        System.out.println("Employee information");
        employee.printMemberDetails();
        employee.printSpecialization();
        Manager manager = new Manager();
        manager.setMemberDetails("Ramesh","USA",28L,98887187L,20000L);
        manager.setDepartment("data Manager");
        System.out.println("Manager Details");
        manager.printMemberDetails();
        manager.printDepartment();
    }
}
