package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Finish {

    private Player winner;

    public Finish(Player winner){
        this.winner = winner;
    }

    private Picture imageFinal = new Picture (10,10, "resources/maxresdefault.jpg");

    public void init(){
      //  imageFinal = winner.getPicture();
        //imageFinal.draw();
        winner.getPicture().draw();
        System.out.println(winner.getWinningImage());
    }


}
