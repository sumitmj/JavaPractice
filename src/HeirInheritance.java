class Game {
    void goal() {
        System.out.println("Football Goal!");
    }
}

class Game1 extends Game {
    void kick() {
        System.out.println("Freekick Scored!");
    }
}

class Game2 extends Game {
    void pen() {
        System.out.println("Penalty Scored!");
    }
}

public class HeirInheritance {
    public static void main(String[] args) {
        Game1 g = new Game1();

        g.kick();
        g.goal();
    }
}
