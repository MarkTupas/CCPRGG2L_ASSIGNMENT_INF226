import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;

public class TryAgain extends JFrame{
    TryAgain(){

        JLabel imageLabel = new JLabel();
        ImageIcon kweenImage = new ImageIcon("Game over 2.gif");
        imageLabel.setIcon(kweenImage);
        this.add(imageLabel);

        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Main Menu");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        
        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler); 
        this.add(tryAgainButton);

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));

        ExitEventHandler exitHandler = new ExitEventHandler();
        exitButton.addActionListener(exitHandler);

        this.add(tryAgainButton);
        this.add(exitButton);


        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);


        // set background color of frame
        this.getContentPane().setBackground(Color.RED);
        // lock frame
        this.setResizable(false);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            new MainMenu();
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }


    
}
