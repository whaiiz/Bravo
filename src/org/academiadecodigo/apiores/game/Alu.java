package org.academiadecodigo.apiores.game;

public class Alu {

    private static String[] lastMath = {"","","","","","","","","",""};

    private static int mFactor1;
    private static int mFactor2;
    private static int mFactors[] = {0,0};


    private static String correctAnswer;

    private static String productText
            ;

    private static int memoryCounter=0;






    public static int[] generateMath(){

        mFactor1 = (int) (Math.random()*9+1);
        mFactor2 = (int) (Math.random()*9+1);

        correctAnswer = (mFactor1*mFactor2) + "";

        productText = "" + mFactor1 + " x " + mFactor2 + " =" ;

        if (!checkMemory()) {generateMath();}

        storeMath();

        mFactors[0] = mFactor1;
        mFactors[1] = mFactor2;

        return (mFactors);

    }

    public static void storeMath (){

        if (memoryCounter == 9) { memoryCounter=0;}


        lastMath[memoryCounter]= productText;

        memoryCounter++;
    }

    public static boolean checkMemory (){

        for (String string : lastMath){
            if (string.equals(productText)){
                return false;
            }
        }
        return true;

    }

    public static String getCorrectAnswer(){
        return correctAnswer;
    }
}
