package gui;

import fileWriting.SavfWriting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons
{

    protected Buttons()
    {
        save();
        reset();
        show();
    }

    private void save()
    {
        Screen.saveGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Screen.saveGame.setText("saved");

                SavfWriting.change("save.savf", "saved", "true");
                SavfWriting.change("save.savf", "score", Screen.score.getText());

                for (int i = 0; i < 6; i++)
                {
                    String line = null;

                    for (int j = 0; j < 6; j++)
                    {
                        String brick = Screen.bricks.get((i*6) + j).getText();

                        if (brick.equals("")) brick = "n";

                        if (line == null) line = brick;
                        else line += "-" + brick;
                    }

                    String param = "line" + i;
                    SavfWriting.change("save.savf", param, line);
                }
            }
        });
    }

    private void reset()
    {
        Screen.resetGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SavfWriting.change("save.savf", "saved", "false");
                Screen.saveGame.setText("save");

                for (JTextField txt: Screen.bricks)
                {
                    txt.setText(null);
                    txt.setBackground(Color.decode("#7817b0"));
                }

                Initializer.init();
            }
        });
    }

    private void show()
    {
        Screen.showKeys.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (Screen.showKeys.getText().equals("show"))
                {
                    Screen.showKeys.setText("close");
                    Screen.keyList.setVisible(true);
                }
                else
                {
                    Screen.showKeys.setText("show");
                    Screen.keyList.setVisible(false);
                }
            }
        });
    }

}
