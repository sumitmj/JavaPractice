class Student {
    int rollno;
    String name;
    static String college = "MIT";

    static void change() {
        college = "Federation";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display (){
        System.out.println(name + rollno +" "+ college);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(11 , "Sumit ");
        Student s2 = new Student(12 , "Karma ");

        s1.display();
        s2.display();
    }
}