package src.Abstraction.Interfaces.program1.live;

import src.Abstraction.Interfaces.program1.music.Playable;
import src.Abstraction.Interfaces.program1.music.string.Veena;
import src.Abstraction.Interfaces.program1.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // a) Veena object
        Veena v = new Veena();
        v.play();

        // b) Saxophone object
        Saxophone s = new Saxophone();
        s.play();

        // c) Playable reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
};