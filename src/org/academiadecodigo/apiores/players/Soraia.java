package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Soraia extends Player {

    private static Picture p1 = new Picture(10,10,"resources/Soraia.png");
    private static Picture arrowPosition = new Picture(10,700,"resources/arrow");

    public Soraia() {

        super(p1,arrowPosition);

    }

    @Override
    public String toString (){
        return "Soraia";

    }


}
