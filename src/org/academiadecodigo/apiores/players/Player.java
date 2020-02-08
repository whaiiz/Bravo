package org.academiadecodigo.apiores.players;

import org.academiadecodigo.apiores.game.Play;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract  class Player {
    private int position;
    private String name;
    private Picture picture;

    public Player () {

    }

    public void move(Player player)  {
        picture.translate(10,0);
        position += 10;
    }
    public void celebrate(){

    }
}



