package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Jojo extends Player {

    private static Picture p1 = new Picture(90,280,"resources/Jojo.png");
    private static Picture arrowPosition = new Picture(10,100,"resources/arrow.png");
    private static Picture winningImage = new Picture(10,10, "resources/soraia.png");


    public Jojo() {

        super (p1,arrowPosition,winningImage);
         //p1.grow( -200,-200);

    }


    public void drawHL(){
        p1.load("resources/jojohl.png");
    }
    public void deleteHL(){
        p1.load("resources/Jojo.png");
    }




   @Override
    public String toString (){
        return "Jojo";

    }



}
