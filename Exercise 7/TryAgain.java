import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;

public class TryAgain extends JFrame{
    TryAgain(){
        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

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
        this.setSize(400,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.WHITE);
        // lock frame
        this.setResizable(false);
    }

    private class TryAgainEventHandler implements ActionListener {

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

