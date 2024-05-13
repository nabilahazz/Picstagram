package com.example.praktikum5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Princess_Aurora","Aurora" ,"Sleeping Beauty" ,R.drawable.aurora,R.drawable.aurora));
        instagrams1.add(new Instagram("Princess_Ariel", "Ariel","The Little Mermaid",R.drawable.ariel,R.drawable.ariel));
        instagrams1.add(new Instagram("Princess_Cinderella", "Cinderella","Putri Sepatu Kaca",R.drawable.cinderella, R.drawable.cinderella));
        instagrams1.add(new Instagram("Princess_Belle","Belle","Beauty And The Beast" ,R.drawable.belle,R.drawable.belle));
        instagrams1.add(new Instagram("Princess_Rapunzel", "Rapunzel","Maknaenya dreamis",R.drawable.rapunzel,R.drawable.rapunzel));
        instagrams1.add(new Instagram("Princess_Snow White","Snow Wihte","Putri Salju",R.drawable.snowihte, R.drawable.snowihte));
        instagrams1.add(new Instagram("Princess_Anna","Anna","Adek nya Elsa",R.drawable.anna,R.drawable.anna));
        instagrams1.add(new Instagram("Princess_Elsa","Elsa","Kakak nya Anna",R.drawable.elsa,R.drawable.elsa));
        return instagrams1;
    }
}

