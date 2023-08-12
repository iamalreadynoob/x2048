package functionality;

import javax.swing.*;

public class Scoring
{

    public static void updateScore(JTextField score, JTextField hiscore, Integer add)
    {
        int current = Integer.parseInt(score.getText().substring(7));
        int highest = Integer.parseInt(hiscore.getText().substring(10));

        if (add == 4) add = 1;
        else if (add == 8) add = 2;
        else if (add == 16) add = 5;
        else if (add == 32) add = 10;
        else if (add == 64) add = 20;
        else if (add == 128) add = 50;
        else if (add == 256) add = 75;
        else if (add == 512) add = 100;
        else if (add == 1024) add = 200;
        else if (add == 2048) add = 500;
        else add = 1000;

        current += add;

        score.setText("Score: " + current);
        if (current > highest) hiscore.setText("Hi-Score: " + current);
    }

    public static String letterScore(String letter)
    {
        if (letter.equals("A")) return "B";
        else if (letter.equals("B")) return "C";
        else if (letter.equals("C")) return "D";
        else if (letter.equals("D")) return "E";
        else if (letter.equals("E")) return "F";
        else if (letter.equals("F")) return "G";
        else if (letter.equals("G")) return "H";
        else if (letter.equals("H")) return "I";
        else if (letter.equals("I")) return "J";
        else if (letter.equals("J")) return "K";
        else if (letter.equals("K")) return "L";
        else if (letter.equals("L")) return "M";
        else if (letter.equals("M")) return "N";
        else if (letter.equals("N")) return "O";
        else if (letter.equals("O")) return "P";
        else if (letter.equals("P")) return "Q";
        else if (letter.equals("Q")) return "R";
        else if (letter.equals("R")) return "S";
        else if (letter.equals("S")) return "T";
        else if (letter.equals("T")) return "U";
        else return "V";
    }

    public static boolean isLetter(String letter)
    {
        if (letter.equals("A") || letter.equals("B") || letter.equals("C") || letter.equals("D") ||
                letter.equals("E") || letter.equals("F") || letter.equals("G") || letter.equals("H") ||
                letter.equals("I") || letter.equals("J") || letter.equals("K") || letter.equals("L") ||
                letter.equals("M") || letter.equals("N") || letter.equals("O") || letter.equals("P") ||
                letter.equals("Q") || letter.equals("R") || letter.equals("S") || letter.equals("T") ||
                letter.equals("U") || letter.equals("V")) return true;
        else return false;
    }

}
