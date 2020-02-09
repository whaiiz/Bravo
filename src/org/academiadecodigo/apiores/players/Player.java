package org.academiadecodigo.apiores.players;

import org.academiadecodigo.apiores.game.Play;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract  class Player {
    private int position = 50;
    private String name;
    private Picture picture;
    private boolean finishLine =false;

    public Player (Picture picture) {

        this.picture = picture;

   }

    public void move()  {
        picture.translate(150,0);
        position += 150;
    }

    public void showPicture(){
        picture.draw();

    }
    public void celebrate(){

    }

    public void setPicture(Picture picture){
        this.picture = picture;

    }

    public Picture getPicture(){
        return picture;
    }

    public void checkFinishLine(){
        if (position >= 1155){
            finishLine = true;
        }
    }


    public boolean getFinishLine(){
        return finishLine;

    }
}



