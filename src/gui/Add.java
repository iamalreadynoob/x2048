package gui;

import javax.swing.*;

public class Add implements IScenes
{

    private JFrame frame;
    protected Add(JFrame frame)
    {
        this.frame = frame;

        home();
        tutorial();
    }

    @Override
    public void home()
    {
        frame.add(Screen.saveGame);
        for (JTextField btn: Screen.bricks) frame.add(btn);
        frame.add(Screen.hiscore);
        frame.add(Screen.score);
        frame.add(Screen.prompt);
        frame.add(Screen.saveGame);
        frame.add(Screen.resetGame);
        frame.add(Screen.showKeys);
        frame.add(Screen.keyList);
    }

    @Override
    public void tutorial()
    {

    }
}
