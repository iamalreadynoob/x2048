package gui;

import functionality.Scoring;

import java.awt.*;
import java.util.ArrayList;

public class Gameplay
{
    protected static void q()
    {
        ArrayList<Integer> lastBricks = new ArrayList<>();
        lastBricks.add(24); lastBricks.add(18); lastBricks.add(12); lastBricks.add(6); lastBricks.add(0);
        lastBricks.add(1); lastBricks.add(2); lastBricks.add(3); lastBricks.add(4);

        ArrayList<Integer> chains = new ArrayList<>();
        chains.add(2);  chains.add(3);  chains.add(4);  chains.add(5);  chains.add(6);
        chains.add(5);  chains.add(4);  chains.add(3);  chains.add(2);

        for (int i = 0; i < chains.size(); i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;
                int spot = lastBricks.get(i);

                for (int j = 0; j < chains.get(i) - 1; j++)
                {
                    if (Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot + 7).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get(spot + 7).getText().equals("#"))
                        {
                            Screen.bricks.get(spot).setBackground(Color.RED.darker());
                            Screen.bricks.get(spot).setText("#");

                            Screen.bricks.get(spot + 7).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get(spot + 7).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get(spot).setText(Screen.bricks.get(spot + 7).getText());
                            Screen.bricks.get(spot + 7).setText(null);
                        }
                    }

                    else if (Screen.bricks.get(spot).getText().equals(Screen.bricks.get(spot + 7).getText()) &&
                            !Screen.bricks.get(spot).getText().equals("#") &&
                            !Screen.bricks.get(spot + 7).getText().equals("#") &&
                            !Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot + 7).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get(spot).getText()))
                            Screen.bricks.get(spot).setText(Scoring.letterScore(Screen.bricks.get(spot).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get(spot).getText()) * 2;
                            Screen.bricks.get(spot).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get(spot + 7).setText(null);
                    }

                    spot += 7;
                }


            }
        }

        Initializer.add();
    }

    protected static void w()
    {
        for (int i = 0; i < 6; i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;

                for (int j = 0; j < 5; j++)
                {
                    if (Screen.bricks.get((j*6) + i).getText().equals("") &&
                            !Screen.bricks.get(((j+1)*6) + i).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get(((j+1)*6) + i).getText().equals("#"))
                        {
                            Screen.bricks.get((j*6) + i).setBackground(Color.RED.darker());
                            Screen.bricks.get((j*6) + i).setText("#");

                            Screen.bricks.get(((j+1)*6) + i).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get(((j+1)*6) + i).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get((j*6) + i).setText(Screen.bricks.get(((j+1)*6) + i).getText());
                            Screen.bricks.get(((j+1)*6) + i).setText(null);
                        }
                    }

                    else if (Screen.bricks.get((j*6) + i).getText().equals(Screen.bricks.get(((j+1)*6) + i).getText()) &&
                            !Screen.bricks.get((j*6) + i).getText().equals("#") &&
                            !Screen.bricks.get(((j+1)*6) + i).getText().equals("#") &&
                            !Screen.bricks.get((j*6) + i).getText().equals("") &&
                            !Screen.bricks.get(((j+1)*6) + i).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get((j*6) + i).getText()))
                            Screen.bricks.get((j*6) + i).setText(Scoring.letterScore(Screen.bricks.get((j*6) + i).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get((j*6) + i).getText()) * 2;
                            Screen.bricks.get((j*6) + i).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get(((j+1)*6) + i).setText(null);
                    }
                }
            }

        }

        Initializer.add();
    }

    protected static void e()
    {
        ArrayList<Integer> lastBricks = new ArrayList<>();
        lastBricks.add(1); lastBricks.add(2); lastBricks.add(3); lastBricks.add(4); lastBricks.add(5);
        lastBricks.add(11); lastBricks.add(17); lastBricks.add(23); lastBricks.add(29);

        ArrayList<Integer> chains = new ArrayList<>();
        chains.add(2);  chains.add(3);  chains.add(4);  chains.add(5);  chains.add(6);
        chains.add(5);  chains.add(4);  chains.add(3);  chains.add(2);

        for (int i = 0; i < chains.size(); i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;
                int spot = lastBricks.get(i);

                for (int j = 0; j < chains.get(i) - 1; j++)
                {
                    if (Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot + 5).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get(spot + 5).getText().equals("#"))
                        {
                            Screen.bricks.get(spot).setBackground(Color.RED.darker());
                            Screen.bricks.get(spot).setText("#");

                            Screen.bricks.get(spot + 5).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get(spot + 5).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get(spot).setText(Screen.bricks.get(spot + 5).getText());
                            Screen.bricks.get(spot + 5).setText(null);
                        }
                    }

                    else if (Screen.bricks.get(spot).getText().equals(Screen.bricks.get(spot + 5).getText()) &&
                            !Screen.bricks.get(spot).getText().equals("#") &&
                            !Screen.bricks.get(spot + 5).getText().equals("#") &&
                            !Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot + 5).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get(spot).getText()))
                            Screen.bricks.get(spot).setText(Scoring.letterScore(Screen.bricks.get(spot).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get(spot).getText()) * 2;
                            Screen.bricks.get(spot).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get(spot + 5).setText(null);
                    }

                    spot += 5;
                }


            }
        }

        Initializer.add();
    }

    protected static void a()
    {
        for (int i = 0; i < 6; i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;

                for (int j = 0; j < 5; j++)
                {
                    if (Screen.bricks.get((i*6) + j).getText().equals("") &&
                            !Screen.bricks.get((i*6) + j + 1).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get((i*6) + j + 1).getText().equals("#"))
                        {
                            Screen.bricks.get((i*6) + j).setBackground(Color.RED.darker());
                            Screen.bricks.get((i*6) + j).setText("#");

                            Screen.bricks.get((i*6) + j + 1).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get((i*6) + j + 1).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get((i*6) + j).setText(Screen.bricks.get((i*6) + j + 1).getText());
                            Screen.bricks.get((i*6) + j + 1).setText(null);
                        }
                    }

                    else if (Screen.bricks.get((i*6) + j).getText().equals(Screen.bricks.get((i*6) + j + 1).getText()) &&
                            !Screen.bricks.get((i*6) + j).getText().equals("#") &&
                            !Screen.bricks.get((i*6) + j + 1).getText().equals("#") &&
                            !Screen.bricks.get((i*6) + j).getText().equals("") &&
                            !Screen.bricks.get((i*6) + j + 1).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get((i*6) + j).getText()))
                            Screen.bricks.get((i*6) + j).setText(Scoring.letterScore(Screen.bricks.get((i*6) + j).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get((i*6) + j).getText()) * 2;
                            Screen.bricks.get((i*6) + j).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get((i*6) + j + 1).setText(null);
                    }
                }
            }

        }

        Initializer.add();
    }

    protected static void s()
    {
        for (int i = 0; i < 6; i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;

                for (int j = 5; j > 0; j--)
                {
                    if (Screen.bricks.get((j*6) + i).getText().equals("") &&
                            !Screen.bricks.get(((j-1)*6) + i).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get(((j-1)*6) + i).getText().equals("#"))
                        {
                            Screen.bricks.get((j*6) + i).setBackground(Color.RED.darker());
                            Screen.bricks.get((j*6) + i).setText("#");

                            Screen.bricks.get(((j-1)*6) + i).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get(((j-1)*6) + i).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get((j*6) + i).setText(Screen.bricks.get(((j-1)*6) + i).getText());
                            Screen.bricks.get(((j-1)*6) + i).setText(null);
                        }
                    }

                    else if (Screen.bricks.get((j*6) + i).getText().equals(Screen.bricks.get(((j-1)*6) + i).getText()) &&
                            !Screen.bricks.get((j*6) + i).getText().equals("#") &&
                            !Screen.bricks.get(((j-1)*6) + i).getText().equals("#") &&
                            !Screen.bricks.get((j*6) + i).getText().equals("") &&
                            !Screen.bricks.get(((j-1)*6) + i).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get((j*6) + i).getText()))
                            Screen.bricks.get((j*6) + i).setText(Scoring.letterScore(Screen.bricks.get((j*6) + i).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get((j*6) + i).getText()) * 2;
                            Screen.bricks.get((j*6) + i).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get(((j-1)*6) + i).setText(null);
                    }
                }
            }

        }

        Initializer.add();
    }

    protected static void d()
    {
        for (int i = 0; i < 6; i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;

                for (int j = 5; j > 0; j--)
                {
                    if (Screen.bricks.get((i*6) + j).getText().equals("") &&
                    !Screen.bricks.get((i*6) + j - 1).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get((i*6) + j - 1).getText().equals("#"))
                        {
                            Screen.bricks.get((i*6) + j).setBackground(Color.RED.darker());
                            Screen.bricks.get((i*6) + j).setText("#");

                            Screen.bricks.get((i*6) + j - 1).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get((i*6) + j - 1).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get((i*6) + j).setText(Screen.bricks.get((i*6) + j - 1).getText());
                            Screen.bricks.get((i*6) + j - 1).setText(null);
                        }
                    }

                    else if (Screen.bricks.get((i*6) + j).getText().equals(Screen.bricks.get((i*6) + j - 1).getText()) &&
                            !Screen.bricks.get((i*6) + j).getText().equals("#") &&
                            !Screen.bricks.get((i*6) + j - 1).getText().equals("#") &&
                            !Screen.bricks.get((i*6) + j).getText().equals("") &&
                            !Screen.bricks.get((i*6) + j - 1).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get((i*6) + j).getText()))
                            Screen.bricks.get((i*6) + j).setText(Scoring.letterScore(Screen.bricks.get((i*6) + j).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get((i*6) + j).getText()) * 2;
                            Screen.bricks.get((i*6) + j).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get((i*6) + j - 1).setText(null);
                    }
                }
            }

        }

        Initializer.add();
    }

    protected static void x()
    {
        ArrayList<Integer> lastBricks = new ArrayList<>();
        lastBricks.add(6); lastBricks.add(12); lastBricks.add(18); lastBricks.add(24); lastBricks.add(30);
        lastBricks.add(31); lastBricks.add(32); lastBricks.add(33); lastBricks.add(34);

        ArrayList<Integer> chains = new ArrayList<>();
        chains.add(2);  chains.add(3);  chains.add(4);  chains.add(5);  chains.add(6);
        chains.add(5);  chains.add(4);  chains.add(3);  chains.add(2);

        for (int i = 0; i < chains.size(); i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;
                int spot = lastBricks.get(i);

                for (int j = 0; j < chains.get(i) - 1; j++)
                {
                    if (Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot - 5).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get(spot - 5).getText().equals("#"))
                        {
                            Screen.bricks.get(spot).setBackground(Color.RED.darker());
                            Screen.bricks.get(spot).setText("#");

                            Screen.bricks.get(spot - 5).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get(spot - 5).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get(spot).setText(Screen.bricks.get(spot - 5).getText());
                            Screen.bricks.get(spot - 5).setText(null);
                        }
                    }

                    else if (Screen.bricks.get(spot).getText().equals(Screen.bricks.get(spot - 5).getText()) &&
                            !Screen.bricks.get(spot).getText().equals("#") &&
                            !Screen.bricks.get(spot - 5).getText().equals("#") &&
                            !Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot - 5).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get(spot).getText()))
                            Screen.bricks.get(spot).setText(Scoring.letterScore(Screen.bricks.get(spot).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get(spot).getText()) * 2;
                            Screen.bricks.get(spot).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get(spot - 5).setText(null);
                    }

                    spot -= 5;
                }


            }
        }

        Initializer.add();
    }

    protected static void c()
    {
        ArrayList<Integer> lastBricks = new ArrayList<>();
        lastBricks.add(31); lastBricks.add(32); lastBricks.add(33); lastBricks.add(34); lastBricks.add(35);
        lastBricks.add(29); lastBricks.add(23); lastBricks.add(17); lastBricks.add(11);

        ArrayList<Integer> chains = new ArrayList<>();
        chains.add(2);  chains.add(3);  chains.add(4);  chains.add(5);  chains.add(6);
        chains.add(5);  chains.add(4);  chains.add(3);  chains.add(2);

        for (int i = 0; i < chains.size(); i++)
        {
            boolean changed = true;

            while (changed)
            {
                changed = false;
                int spot = lastBricks.get(i);

                for (int j = 0; j < chains.get(i) - 1; j++)
                {
                    if (Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot - 7).getText().equals(""))
                    {
                        changed = true;

                        if (Screen.bricks.get(spot - 7).getText().equals("#"))
                        {
                            Screen.bricks.get(spot).setBackground(Color.RED.darker());
                            Screen.bricks.get(spot).setText("#");

                            Screen.bricks.get(spot - 7).setBackground(Color.decode("#7817b0"));
                            Screen.bricks.get(spot - 7).setText(null);
                        }
                        else
                        {
                            Screen.bricks.get(spot).setText(Screen.bricks.get(spot - 7).getText());
                            Screen.bricks.get(spot - 7).setText(null);
                        }
                    }

                    else if (Screen.bricks.get(spot).getText().equals(Screen.bricks.get(spot - 7).getText()) &&
                            !Screen.bricks.get(spot).getText().equals("#") &&
                            !Screen.bricks.get(spot - 7).getText().equals("#") &&
                            !Screen.bricks.get(spot).getText().equals("") &&
                            !Screen.bricks.get(spot - 7).getText().equals(""))
                    {
                        Integer number = null;

                        if (Scoring.isLetter(Screen.bricks.get(spot).getText()))
                            Screen.bricks.get(spot).setText(Scoring.letterScore(Screen.bricks.get(spot).getText()));
                        else
                        {
                            number = Integer.parseInt(Screen.bricks.get(spot).getText()) * 2;
                            Screen.bricks.get(spot).setText(Integer.toString(number));
                        }

                        Scoring.updateScore(Screen.score, Screen.hiscore, number);
                        Screen.bricks.get(spot - 7).setText(null);
                    }

                    spot -= 7;
                }


            }
        }

        Initializer.add();
    }


}
