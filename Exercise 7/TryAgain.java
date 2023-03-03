import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TryAgain extends JFrame{
    TryAgain(){
        
        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        tryAgainButton.setFocusable(false);

        EventHandler1 tryhandler = new EventHandler1();
        tryAgainButton.addActionListener(tryhandler);
        
        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setFocusable(false);

        EventHandler2 exhandler = new EventHandler2();
        exitButton.addActionListener(exhandler);

        this.add(tryAgainButton);
        this.add(exitButton);


        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.WHITE);
        // lock frame
        this.setResizable(false);


    }
    private class EventHandler1 implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            // open game frame
            new GameFrame();
            // Close main menu frame
            dispose();

    }
}
private class EventHandler2 implements ActionListener{

    public void actionPerformed(ActionEvent event) {
        
        // open game frame
        new GameFrame();
        // Close main menu frame
        dispose();

}
}

}
