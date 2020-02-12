package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Finish {

    private Player winner;
    private Picture imageFinal = new Picture (10,10, "resources/maxresdefault.jpg");
    private Picture backgroundImage = new Picture (10,10, "resources/maxresdefault.jpg");

    public Finish(Player winner){
        this.winner = winner;
        init();
    }



    public void init(){
      //  imageFinal = winner.getPicture();
        //imageFinal.draw();
        backgroundImage.draw();
        winner.getPicture().draw();

        System.out.println(winner.getWinningImage());
    }


}
