package org.academiadecodigo.apiores.players;

import org.academiadecodigo.apiores.game.Play;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract  class Player {
    private int position;
    private String name;
    private Picture picture;

    public Player (Picture picture) {
       // this.position = position;
        //this.name = name;
        this.picture = picture;

   }

    public void move(Player player)  {
        picture.translate(10,0);
        position += 10;
    }

    public void showPicture(){
        picture.draw();

    }
    public void celebrate(){

    }

    public void setPicture(Picture picture){
        this.picture = picture;


    }
}



