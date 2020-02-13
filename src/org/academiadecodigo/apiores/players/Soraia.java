package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Soraia extends Player {

    private static Picture p1 = new Picture(80,450,"resources/Soraia.png");

    public Soraia() {

        super(p1);

    }

    public void drawHL(){
        p1.load("resources/soraiahl.png");
    }
    public void deleteHL(){
        p1.load("resources/Soraia.png");
    }

    @Override
    public String toString (){
        return "Soraia";

    }


}
