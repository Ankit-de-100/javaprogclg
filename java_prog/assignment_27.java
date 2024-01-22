class Student {
    static int studentCount = 0; 
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++; 
    }

   
    public static int getStudentCount() {
        return studentCount;
    }
}

public class assignment_27 {
    public static void main(String[] args) {
       
        Student student1 = new Student("Ankit", 20);
        Student student2 = new Student("Arunabha", 22);
        Student student3 = new Student("Sagarnil", 21);

        
        int totalStudents = Student.getStudentCount();
        System.out.println("Total number of students: " + totalStudents);

        
        System.out.println(student1.name + " is aware of " + Student.studentCount + " students.");
        System.out.println(student2.name + " is aware of " + Student.studentCount + " students.");
        System.out.println(student3.name + " is aware of " + Student.studentCount + " students.");
    }
}


