package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Play {

    private Player p1;
    private Player p2;

    private Player currentPlayer;

    private Picture gamePicture = new Picture(10,10,"resources/GameBackground.png");

    String answer;

    KeyboardListener keyboardListener;

   // private KeyboardListener keyboardListener = new KeyboardListener(gamePicture);

    // private boolean winner = false;


    public Player  init (){

        p1 = Game.getPlayers()[0];
        p2 = Game.getPlayers()[1];

        gamePicture.draw();
        p1.getPicture().draw();
        p2.getPicture().draw();

        logicGame();

        return currentPlayer;


    }

    public void logicGame (){
        if(p1.getFinishLine() == false || p2.getFinishLine()== false) {
            readQuestion();
        }
        logicGame();

    }

    public void readQuestion() {


        if (currentPlayer == p1) {
            currentPlayer = p2;
            return;
        }
        currentPlayer = p1;

        int[] mFactors = Alu.generateMath();

        drawNumbers(mFactors);

        keyboardListener = new KeyboardListener(this);
    }
    public void checkQuestion(){

        answer = keyboardListener.getAnswer();
        System.out.println("resposta " + answer);

            if (answer.equals(Alu.getCorrectAnswer())) {
                //correctSymbol.draw();

                currentPlayer.move();
                //precisamos de um delay!!
           }
            //currentPlayer.move();
            //currentPlayer.move();
            //System.out.println("teste 4");

       // }

    }


    private Picture selectPicture(int i) {

        switch (i) {
            case 0:
                return new Picture(370, 50, "resources/0.png");
            //firstNumber0.draw();
            //break;
            case 1:
                return new Picture(375, 50, "resources/1.png");
            //firstNumber1.draw();
            //break;
            case 2:
                return new Picture(390, 50, "resources/2.png");
            //firstNumber2.draw();
            //break;
            case 3:
                return new Picture(380, 50, "resources/3.png");
            //firstNumber3.draw();
            //break;
            case 4:
                return new Picture(380, 50, "resources/4.png");
            //firstNumber4.draw();
            //break;
            case 5:
                return new Picture(380, 50, "resources/5.png");
            //firstNumber5.draw();
            //break;
            case 6:
                return new Picture(375, 50, "resources/6.png");
            //firstNumber6.draw();
            //break;
            case 7:
                return new Picture(380, 50, "resources/7.png");
            //firstNumber7.draw();
            //break;
            case 8:
                return new Picture(365, 50, "resources/8.png");
            //firstNumber8.draw();
            //break;
            case 9:
                return new Picture(370, 50, "resources/9.png");
            //firstNumber9.draw();
            //break;
            case 10:
                return new Picture(370, 50, "resources/10.png");
            //firstNumber10.draw();
            //break;
        }
        return null;
    }

    private void drawFirstPicture(int arrayNumber0) {

        if(arrayNumber0 == 10) {

            Picture ten = selectPicture(arrayNumber0);
            ten.translate(-40,0);
            ten.draw();
        }else {
            selectPicture(arrayNumber0).draw();
        }



    }

    private void drawSecondPicture(int arrayNumber1){
        Picture picture = selectPicture(arrayNumber1);
        picture.translate(150, 0);
        picture.draw();
    }

    public void drawNumbers(int counts[]) {

        drawFirstPicture(counts[0]);

        Picture multiplication = new Picture(450, 50, "resources/x.png");
        multiplication.draw();

        drawSecondPicture(counts[1]);

        Picture equal = new Picture(600, 50, "resources/=.png");

        if (counts[1] == 10) {
            equal.translate(20, 0);
        }

        equal.draw();

    }








}

