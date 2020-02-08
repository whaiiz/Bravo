package org.academiadecodigo.apiores.game;

public class Alu {

    private static String[] lastMath = new String[10];

    private static int mFactor1;
    private static int mFactor2;
    private static String productText;

    private static int memoryCounter=0;




    public static String generateMath(){

        mFactor1 = (int) (java.lang.Math.random()*10);
        mFactor2 = (int) (java.lang.Math.random()*10);

        int product = mFactor1*mFactor2;

        productText = ""+product;

        storeMath();

        if (checkMemory() == false) {generateMath();}

        return ("" + product);

    }

    public static void storeMath (){

        if (memoryCounter == 9) { memoryCounter=0;}


        lastMath[memoryCounter]= productText;

        memoryCounter++;
    }

    public static boolean checkMemory (){

        for (String string : lastMath){
            if (string == productText){
                return false;
            }
        }
        return true;

    }
}
