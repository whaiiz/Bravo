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

    public void move()  {

        int totalMoove=0;
        while (totalMoove<100) {
            p1.translate(0.5, 0);
            totalMoove+=1;
        }
        position += 100;
    }
    public boolean checkFinishLine(){

        if (position >=  500){ //850 CORRECTO
            return true;
        }
        return false;

    }


   @Override
    public String toString (){
        return "Jojo";

    }



}
