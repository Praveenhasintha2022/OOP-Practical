import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class swing_frames extends JFrame{

    swing_frames(){

        JFrame frame = new JFrame(); 
        frame.setTitle("Imesh Chandula");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true); 
        
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(255,255,255));

        ImageIcon image = new ImageIcon("null");
        frame.setIconImage(image.getImage());

    }



    public static void main(String[] args) {
        new swing_frames();
    }

}