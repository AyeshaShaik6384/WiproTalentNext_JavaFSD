package src.Abstraction.Interfaces.program1.music.wind;

import src.Abstraction.Interfaces.program1.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }

}