class Football {
    void goal() {
        System.out.println("Football Goal!");
    }
}

class FreeKick extends Football {
    void kick() {
        System.out.println("Freekick Scored!");
    }
}

class Penalty extends FreeKick {
    void pen() {
        System.out.println("Penalty Scored!");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Penalty p = new Penalty();

        p.goal();
        p.kick();
        p.pen();
    }
}
