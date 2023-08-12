package gui;

import javax.swing.*;
import java.util.ArrayList;

public class CreateNew implements IScenes
{

    protected CreateNew()
    {
        home();
        tutorial();
    }

    @Override
    public void home()
    {
        Screen.saveGame = new JButton();

        Screen.bricks = new ArrayList<>();
        for (int i = 0; i < 36; i++) Screen.bricks.add(new JTextField());

        Screen.hiscore = new JTextField();
        Screen.score = new JTextField();
        Screen.prompt = new JTextField();
        Screen.resetGame = new JButton();
        Screen.showKeys = new JButton();
        Screen.keyList = new JTextArea();
    }

    @Override
    public void tutorial()
    {

    }
}
