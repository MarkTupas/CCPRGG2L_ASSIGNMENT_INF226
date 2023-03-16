

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ImageIcon;

import java.awt.*;

public class ColorMenu extends JFrame{

    // Jlist
    JList colorList;
    // Color arrays
    private String[] colorNameArray = {"GRAY", "BLUE", "WHITE", "BLACK"};
    private Color[] colorClassArray = {Color.GRAY, Color.BLUE, Color.WHITE, Color.BLACK};
    
    ColorMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon catImage = new ImageIcon("snake.gif");
        imageLabel.setIcon(catImage);
        this.add(imageLabel);

        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose BG color");
        label.setFont(new Font("ARIAL", Font.PLAIN, 25));
        label.setForeground(Color.orange);
        this.add(label);

        // Jlist
        colorList = new JList(colorNameArray);
        // Restricts to one selection
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("ARIAL", Font.BOLD, 20));

        // Add event
        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);

        this.add(colorList);

        this.setLayout(new FlowLayout());
        this.setTitle("SNAKE GAMERIST");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(255,290);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.GRAY);
    }

    // Event Handler
    private class BGColorEventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorClassArray[colorList.getSelectedIndex()];

            // open game frame
            new GameFrame();

            // Close color menu
            dispose();
        }
    } 
    
}