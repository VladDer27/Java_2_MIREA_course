package ru.mirea.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MilanMadrid extends JFrame{
    JButton milanAC =  new JButton("AC MILAN");
    JButton realMadrid = new JButton("Real Madrid");
    JButton score = new JButton("Result: 0 X 0");
    JButton lastScorer = new JButton("Last Scorer: N/A");
    JButton result = new JButton("Winner: DRAW");

    int milanScore = 0;
    int madridScore = 0;

    MilanMadrid(Container pane){
        pane.add(milanAC, BorderLayout.LINE_START);
        pane.add(realMadrid, BorderLayout.LINE_END);
        pane.add(score, BorderLayout.PAGE_START);
        pane.add(lastScorer, BorderLayout.CENTER);
        pane.add(result, BorderLayout.PAGE_END);

        milanAC.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milanScore > madridScore) {
                    result.setText("Winner: AC Milan");
                } else if (milanScore == madridScore) {
                    result.setText("Winner: DRAW");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        realMadrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if(madridScore > milanScore){
                    result.setText("Winner: Real Madrid");
                } else if (milanScore == madridScore) {
                    result.setText("Winner: DRAW");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void createAndShowGUI(){
        //Create and set up the window.
        JFrame frame = new JFrame("AC Milan VS Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        new MilanMadrid(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
