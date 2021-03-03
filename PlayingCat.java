package com;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean b = false;
        if (summer && temperature >= 25 && temperature <= 45)
            b = true;
        else if (summer && temperature < 25 && temperature > 45)
            return b;
        else if (!summer && temperature >= 25 && temperature <= 35)
            b = true;
        return b;
    }
}
