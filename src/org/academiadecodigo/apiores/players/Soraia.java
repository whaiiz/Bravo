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
    public void move()  {

        int totalMove=0;

        while (totalMove<300) {
            p1.translate(0.5, 0);
            totalMove+=1;
        }

        position += 1;
    }
    public boolean checkFinishLine(){

        if (position >=  6){ //850 CORRECTO
            return true;
        }
        return false;
    }
    @Override
    public String toString (){
        return "Soraia";

    }


}
