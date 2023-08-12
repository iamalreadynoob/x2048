package gui;

import fileReading.SavfReading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Screen extends JFrame implements KeyListener
{
    //home
    protected static JButton saveGame, resetGame, showKeys;
    protected static ArrayList<JTextField> bricks;
    protected static JTextField hiscore, score, prompt;
    protected static JTextArea keyList;

    public Screen()
    {
        this.setSize(1000, 700);
        this.setTitle("x2048");
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);

        new CreateNew();
        new Add(this);
        new Positions();
        new Buttons();
        this.setFocusable(true);
        this.addKeyListener(this);

        SavfReading reading = new SavfReading();
        reading.scan("save.savf");
        boolean saved = Boolean.parseBoolean(reading.getValue("saved"));

        if (saved) Initializer.load();
        else Initializer.init();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent)
    {
        if (Screen.bricks.get(0).isVisible())
        {
            switch (keyEvent.getKeyChar())
            {
                case 'q':
                case 'Q':
                    Screen.saveGame.setText("save");
                    Gameplay.q(); break;

                case 'w':
                case 'W':
                    Screen.saveGame.setText("save");
                    Gameplay.w(); break;

                case 'e':
                case 'E':
                    Screen.saveGame.setText("save");
                    Gameplay.e(); break;

                case 'a':
                case 'A':
                    Screen.saveGame.setText("save");
                    Gameplay.a(); break;

                case 's':
                case 'S':
                    Screen.saveGame.setText("save");
                    Gameplay.s(); break;

                case 'd':
                case 'D':
                    Screen.saveGame.setText("save");
                    Gameplay.d(); break;

                case 'x':
                case 'X':
                    Screen.saveGame.setText("save");
                    Gameplay.x(); break;

                case 'c':
                case 'C':
                    Screen.saveGame.setText("save");
                    Gameplay.c(); break;
            }
        }
    }
}
