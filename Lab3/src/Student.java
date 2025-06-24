//Qno4
public class Student {
    String name;
    String number;
    int rollNo;
    String address;
    String grade;

    public Student(String name, String number, int rollNo, String address, String grade) {
        this.name = name;
        this.number = number;
        this.rollNo = rollNo;
        this.address = address;
        this.grade = grade;
    }
    void displayInfo(){
        System.out.println("Student name : "+name);
        System.out.println("Student rollNo : "+rollNo);
        System.out.println("Student address :"+address);
        System.out.println("Student grade :"+grade);
        System.out.println("Student number :"+number);
    }

    public static void main(String[] args) {
        Student std = new Student("ram","9818787429",12,"chabahil","10");
    std.displayInfo();
    }
}
