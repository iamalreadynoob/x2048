package gui;

import fileReading.SavfReading;

import javax.swing.*;
import java.awt.*;

public class Positions implements IScenes
{

    protected Positions()
    {
        home();
        tutorial();
    }

    @Override
    public void home()
    {
        int index = 0;
        int initX = 325;
        int initY = 125;

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                Screen.bricks.get(index).setBounds(initX + (j * 60), initY + (i * 60), 50, 50);
                Screen.bricks.get(index).setBackground(Color.decode("#7817b0"));
                Screen.bricks.get(index).setForeground(Color.WHITE);
                Screen.bricks.get(index).setBorder(null);
                Screen.bricks.get(index).setEditable(false);
                Screen.bricks.get(index).setHorizontalAlignment(SwingConstants.CENTER);
                index++;
            }
        }

        Screen.score.setBounds(325, 500, 170, 30);
        Screen.score.setBackground(null);
        Screen.score.setForeground(Color.WHITE);
        Screen.score.setEditable(false);

        Screen.hiscore.setBounds(505, 500, 170, 30);
        Screen.hiscore.setBackground(null);
        Screen.hiscore.setForeground(Color.WHITE);
        Screen.hiscore.setEditable(false);

        SavfReading reading = new SavfReading();
        reading.scan("save.savf");
        Screen.hiscore.setText("Hi-Score: " + reading.getValue("hiscore"));

        Screen.prompt.setBounds(325, 550, 350, 30);
        Screen.prompt.setBackground(null);
        Screen.prompt.setForeground(Color.WHITE);
        Screen.prompt.setEditable(false);
        Screen.prompt.setBorder(null);

        Screen.saveGame.setBounds(325, 85, 170, 30);
        Screen.saveGame.setBackground(Color.decode("#7817b0"));
        Screen.saveGame.setForeground(Color.WHITE);
        Screen.saveGame.setText("save");
        Screen.saveGame.setBorder(null);
        Screen.saveGame.setFocusable(false);

        Screen.resetGame.setBounds(505, 85, 170, 30);
        Screen.resetGame.setBackground(Color.decode("#7817b0"));
        Screen.resetGame.setForeground(Color.WHITE);
        Screen.resetGame.setText("reset");
        Screen.resetGame.setBorder(null);
        Screen.resetGame.setFocusable(false);

        Screen.showKeys.setBounds(100, 85, 200, 30);
        Screen.showKeys.setBackground(Color.decode("#7817b0"));
        Screen.showKeys.setForeground(Color.WHITE);
        Screen.showKeys.setText("show");
        Screen.showKeys.setBorder(null);
        Screen.showKeys.setFocusable(false);

        Screen.keyList.setBounds(100, 125, 200, 350);
        Screen.keyList.setBackground(null);
        Screen.keyList.setForeground(Color.WHITE);
        Screen.keyList.setText("KEYS\nw: up\na: left\ns: down\nd: right\nq: up left\ne: up right\nx: down left\nc: down right");
        Screen.keyList.setEditable(false);
        Screen.keyList.setLineWrap(true);
        Screen.keyList.setWrapStyleWord(true);
        Screen.keyList.setVisible(false);
    }

    @Override
    public void tutorial()
    {

    }
}
