//Qno2
public class Employee {
double salary,noOfHourPerDay;

public void getInfo(double salary, double noOfHourPerDay){
this.salary = salary;
this.noOfHourPerDay = noOfHourPerDay;
}

public void addSal(){
    if (salary<=500){
        salary+=10;
    }
}
public void addWork(){
    if(noOfHourPerDay>=6){
        salary+=5;
    }
}
public void finalSalary(){
    System.out.println(STR."the final salary is \{salary}");
}

    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.salary = 500;
    employee.noOfHourPerDay = 6;
    employee.getInfo(employee.salary, employee.noOfHourPerDay);
    employee.addSal();
    employee.addWork();
    employee.finalSalary();
    }
}
