class SecondClass {
    int age;
    String name;

    void insert(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println(age + name);
    }
}

public class FirstClass {
    public static void main(String[] args) {
        SecondClass person1 = new SecondClass();
        SecondClass person2 = new SecondClass();

        person1.insert(18, " Sumit");
        person2.insert(20, " Shreejan");

        person1.display();
        person2.display();
    }
}
