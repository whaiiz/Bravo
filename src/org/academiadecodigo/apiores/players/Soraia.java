package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Soraia extends Player {

    private static Picture p1 = new Picture(80,450,"resources/Soraia.png");
    private int position = 0;

    public Soraia() {

        super(p1);

    }

    public void setPicture(){

        p1 = new Picture(80,450,"resources/Soraia.png");

    }

    public void drawHL(){
        p1.load("resources/soraiahl.png");
    }
    public void deleteHL(){
        p1.load("resources/Soraia.png");
    }

    public void showPicture(){
        p1.draw();
    }

    @Override
    public String toString (){
        return "Soraia";

    }


}
