public class Main {
    public static void main(String[] args) {
        Address obj3=new Address(" Mumbai "," Maharashtra ",400021);
        Address obj4=new Address(" Bengaluru ","Karnataka ",560085);

        Employee employee=new Employee("Bhanu ",22,obj3,279980,"GET ",62000);
        Student student=new Student("Karan ",23,obj4,11,"90");

        employee.displayInfo();
        employee.applyForLeave();
        student.displayInfo();

    }
}

