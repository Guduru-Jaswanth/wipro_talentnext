package live;

import music.Playable;
import music.String.Veena;
import music.wind.saxophone;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        saxophone sax = new saxophone();
        sax.play();

        Playable p1 = veena;
        p1.play();

        Playable p2 = sax;
        p2.play();
    }
}
