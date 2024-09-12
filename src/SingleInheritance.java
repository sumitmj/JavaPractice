class Car {
    void sound() {
        System.out.println("Good sound!");
    }
}

class Porsche extends Car {
    void noise() {
        System.out.println("Good noise!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Porsche p = new Porsche();

        p.sound();
        p.noise();
    }
}
