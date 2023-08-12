package gui;

import fileReading.SavfReading;
import fileWriting.SavfWriting;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Initializer
{

    protected static void init()
    {
        Screen.score.setText("Score: 0");

        ArrayList<Integer> initIndexes = new ArrayList<>();

        for (int i = 0; i < 4; i++)
        {
            int index;

            do {index = new Random().nextInt(36);}
            while (initIndexes.contains(index));

            initIndexes.add(index);
        }

        Screen.bricks.get(initIndexes.get(0)).setBackground(Color.RED.darker());
        Screen.bricks.get(initIndexes.get(0)).setText("#");

        Screen.bricks.get(initIndexes.get(1)).setBackground(Color.RED.darker());
        Screen.bricks.get(initIndexes.get(1)).setText("#");

        Screen.bricks.get(initIndexes.get(2)).setText("2");
        Screen.bricks.get(initIndexes.get(3)).setText("2");
    }

    protected static void add()
    {
        if (isEnd()) finisher();
        else
        {
            int destiny = new Random().nextInt(10);

            String newNum;
            if (destiny > 7) newNum = "4";
            else newNum = "2";

            while (true)
            {
                int place = new Random().nextInt(36);

                if (Screen.bricks.get(place).getText().equals(""))
                {
                    Screen.bricks.get(place).setText(newNum);
                    break;
                }
            }
        }

        if (isEnd()) finisher();
    }

    private static boolean isEnd()
    {
        boolean end = true;

        boolean full = true;
        for (JTextField txt: Screen.bricks)
            if (txt.getText().equals(""))
            {
                full = false;
                break;
            }

        if (full)
        {
            for (int i = 0; i < 36; i++)
            {
                if (i > 5 && Screen.bricks.get(i - 6).getText().equals(Screen.bricks.get(i).getText()))
                {
                    end = false;
                    break;
                }

                if (i > 5 && (i+6) % 6 != 5 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i-5).getText()))
                {
                    end = false;
                    break;
                }

                if ((i+6) % 6 != 5 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i+1).getText()))
                {
                    end = false;
                    break;
                }

                if (i < 30 && (i+6) % 6 != 5 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i+7).getText()))
                {
                    end = false;
                    break;
                }

                if (i < 30 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i+6).getText()))
                {
                    end = false;
                    break;
                }

                if (i < 30 && (i+6) % 6 != 0 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i+5).getText()))
                {
                    end = false;
                    break;
                }

                if ((i+6) % 6 != 0 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i-1).getText()))
                {
                    end = false;
                    break;
                }

                if (i > 5 && (i+6) % 6 != 0 && Screen.bricks.get(i).getText().equals(Screen.bricks.get(i-7).getText()))
                {
                    end = false;
                    break;
                }
            }
        }
        else end = false;


        return end;
    }

    private static void finisher()
    {
        Screen.prompt.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        Screen.prompt.setText("Latest " + Screen.score.getText());

        int current = Integer.parseInt(Screen.score.getText().substring(7));
        int highest = Integer.parseInt(Screen.hiscore.getText().substring(10));
        if (current == highest) SavfWriting.change("save.savf", "hiscore", Integer.toString(current));

        Screen.score.setText("Score: 0");

        for (JTextField txt: Screen.bricks)
        {
            txt.setText(null);
            txt.setBackground(Color.decode("#7817b0"));
        }

        Screen.saveGame.setText("save");
        SavfWriting.change("save.savf", "saved", "false");

        init();
    }

    protected static void load()
    {
        SavfReading reading = new SavfReading();
        reading.scan("save.savf");

        for (int i = 0; i < 6; i++)
        {
            String param = "line" + i;

            String line = reading.getValue(param);

            String[] bricks = line.split("-");
            for (int j = 0; j < 6; j++) if (bricks[j].equals("n")) bricks[j] = "";

            for (int j = 0; j < 6; j++)
            {
                Screen.bricks.get((i*6) + j).setText(bricks[j]);
                if (bricks[j].equals("#")) Screen.bricks.get((i*6) + j).setBackground(Color.RED.darker());
            }
        }

        Screen.score.setText(reading.getValue("score"));
    }

}
