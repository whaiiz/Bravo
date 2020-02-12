package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Jojo extends Player {

        private static Picture p1 = new Picture(10,10,"resources/Jojo.png");
        private static Picture arrowPosition = new Picture(10,100,"resources/arrow.png");
        private static Picture winningImage = new Picture(10,10, "resources/soraia.png");


        public Jojo() {

         super (p1,arrowPosition,winningImage);
          p1.grow(-200,-200);
        }


       @Override
        public String toString (){
            return "Jojo";

        }



}
