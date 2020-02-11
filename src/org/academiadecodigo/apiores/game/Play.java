package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Play {

    private Player p1;
    private Player p2;
    private Player currentPlayer = p1;

    private Picture gamePicture = new Picture(10,10,"resources/GameBackground.png");

    private Picture firstPicture;
    private Picture secondPicture;
    private Picture xSign = new Picture(450, 50, "resources/x.png");
    private Picture equalSign = new Picture(600, 50, "resources/=.png");

    String answer;

    KeyboardListener keyboardListener;

   // private KeyboardListener keyboardListener = new KeyboardListener(gamePicture);

    private boolean winner = false;


    public Player  init (){

        p1 = Game.getPlayers()[0];
        p2 = Game.getPlayers()[1];
        gamePicture.draw();
        p1.showPicture();
        p2.showPicture();
        return logicGame();  

    }

    public Player logicGame (){

        if(!p1.checkFinishLine() && !p2.checkFinishLine()) {
            readQuestion();
        }
        winner = true;


        return currentPlayer;

    }

    public void readQuestion() {

        if (currentPlayer == p1) {
            currentPlayer = p2;
            p2.drawArrow();
            p1.deleteArrow();

        }else{
           currentPlayer = p1;
           p1.drawArrow();
           p2.deleteArrow();

        }

        //System.out.println(currentPlayer);

        int[] mFactors = Alu.generateMath();
        //System.out.println(mFactors[0] + "x" +mFactors[1]);

        drawNumbers(mFactors);

        keyboardListener = new KeyboardListener(this);
        keyboardListener.setAnswerInput();
    }

    public void checkQuestion(){

        answer = keyboardListener.getAnswer();

        //System.out.println("resposta " + answer);

            if (answer.equals(Alu.getCorrectAnswer())) {
                //correctSymbol.draw();

                currentPlayer.move();
               // System.out.println("Acertou");
                //precisamos de um delay!!

           }else{
                //System.out.println("ERROU");
            }

        keyboardListener.cleanAnswer();

        deleteNumbers();

        logicGame();

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

            firstPicture = selectPicture(arrayNumber0);
            firstPicture.translate(-40,0);
            firstPicture.draw();
        }else {
            firstPicture = selectPicture(arrayNumber0);
            firstPicture.draw();
        }

    }

    private void drawSecondPicture(int arrayNumber1){
        secondPicture = selectPicture(arrayNumber1);
        secondPicture.translate(150, 0);
        secondPicture.draw();
    }

    public void drawNumbers(int counts[]) {

        drawFirstPicture(counts[0]);

        xSign.draw();

        drawSecondPicture(counts[1]);

        equalSign.draw();

        if (counts[1] == 10) {
            equalSign.translate(20, 0);
        }

        equalSign.draw();

    }

    public void deleteNumbers(){

        firstPicture.delete();
        secondPicture.delete();
        xSign.delete();
        equalSign.delete();
    }

}

