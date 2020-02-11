package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract  class Player {
    private int position = 50;
    private Picture picture;
    private Picture arrowPosition;

    private boolean finishLine =false;
    private boolean currentPlayer = false;



    public Player (Picture picture,Picture arrowPosition) {

        this.picture = picture;
        this.arrowPosition = arrowPosition;

   }

    public void move()  {
        picture.translate(100,0);
        arrowPosition.translate(100,0);
        position += 150;
    }

    public void showPicture(){
        picture.draw();
    }

    public void celebrate(){

    }

    public void drawArrow(){
            arrowPosition.draw();
    }

    public void deleteArrow(){
        arrowPosition.delete();
    }


    public void checkFinishLine(){
        if (position >= 1155){
            finishLine = true;
        }
    }


    public boolean getFinishLine(){
        return finishLine;

    }

    public void setCurrentPlayer(){

       if (currentPlayer){
           currentPlayer = false;
           return;
       }
       currentPlayer = true;
    }

}



