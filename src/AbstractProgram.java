abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Rohit extends Animal {
    public void animalSound() {
        System.out.println("Rohit snores");
    }
}

class Karma extends Animal {
    public void animalSound() {
        System.out.println("Karma ghurghur");
    }
}


public class AbstractProgram {
    public static void main(String[] args) {
        Rohit myRohit = new Rohit();
        Karma myKarma = new Karma();
        myRohit.animalSound();
        myRohit.sleep();
        myKarma.animalSound();
    }
}
