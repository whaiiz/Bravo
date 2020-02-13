package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Jojo extends Player {

    private static Picture p1 = new Picture(90,280,"resources/Jojo.png");
    private int position = 0;

    public Jojo() {
        super (p1);

    }

    public void drawHL(){
        p1.load("resources/jojohl.png");
    }
    public void deleteHL(){
        p1.load("resources/Jojo.png");
    }


    public void setPicture(){
        p1 = new Picture(90,280,"resources/Jojo.png");
    }


    public void showPicture(){
        p1.draw();
    }


   @Override
    public String toString (){
        return "Jojo";

    }



}
