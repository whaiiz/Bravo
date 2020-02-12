package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract  class Player {
    private int position = 0;
    private Picture picture;
    private Picture arrowPosition;
    private Picture winingImage;

    private boolean finishLine =false;
    private boolean currentPlayer = false;


    public Player (Picture picture,Picture arrowPosition) {

        this.picture = picture;
        this.arrowPosition = arrowPosition;

   }
   public Player (Picture picture,Picture arrowPosition, Picture winningImage) {

        this.picture = picture;
        this.arrowPosition = arrowPosition;
        this.winingImage = winningImage;

    }

    public void move()  {
        picture.translate(100,0);
        arrowPosition.translate(100,0);
        position += 100;
    }

    public void showPicture(){
        picture.draw();
    }
    public Picture getPicture(){
        return picture;
    }

    public void celebrate(){

    }

    public void drawArrow(){
            arrowPosition.draw();
    }

    public void deleteArrow(){
        arrowPosition.delete();
    }


    public boolean checkFinishLine(){
        if (position >= 350){ //850 CORRECTO
            return true;
        }
        return false;
    }

    public Picture getWinningImage(){
        return winingImage;
    }



    public void setCurrentPlayer(){

       if (currentPlayer){
           currentPlayer = false;
           return;
       }
       currentPlayer = true;
    }

}



