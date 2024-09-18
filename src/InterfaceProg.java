interface Human {
    public void animalSound();
    public void sleep();
}

class Shreejan implements Human {
    @Override
    public void animalSound() {
        System.out.println("Shreejan ghur ghure");
    }
    public void sleep() {
        System.out.println("Shreejan zzz");
    }
}

public class InterfaceProg {
    public static void main(String[] args) {
        Shreejan mySound = new Shreejan();
        mySound.animalSound();
        mySound.sleep();
    }
}
