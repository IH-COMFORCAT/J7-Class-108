import classes.AndroidPlayer;
import classes.ApplePlayer;
import interfaces.Playable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Playable[] playables = new Playable[2];
        playables[0] = new AndroidPlayer("Whatever", new ArrayList<>(),100);
        playables[1] = new ApplePlayer();




    }
}