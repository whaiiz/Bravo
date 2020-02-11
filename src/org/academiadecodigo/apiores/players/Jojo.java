package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Jojo extends Player {

        private static Picture p1 = new Picture(10,10,"resources/Jojo.png");
        private static Picture arrowPosition = new Picture(10,100,"resources/arrow.png");


        public Jojo() {

         super (p1,arrowPosition);
          p1.grow(-200,-200);
        }


       @Override
        public String toString (){
            return "Jojo";

        }



}
