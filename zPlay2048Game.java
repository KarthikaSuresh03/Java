import java.util.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

class GameFrame extends JFrame implements ActionListener {

    JButton play, exit;

    GameFrame() {

        super("Play 2048");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        play = new JButton("Play");
        exit = new JButton("Exit");
        
        add(play);
        add(exit);
        play.setBounds(10, 300, 50, 20);
        exit.setBounds(100, 300, 50, 20);

        play.addActionListener(null);
        exit.addActionListener(null);
    }


    public void actionPerformed (ActionEvent ae) {

        if(ae.getSource() == play) {
            
            //play game
        }
        if(ae.getSource() == exit) {
            System.exit(0);
        }
    }
}
public class Play2048Game {

    public static void main(String[] args) {
        
        GameFrame p = new GameFrame();
    }
}
