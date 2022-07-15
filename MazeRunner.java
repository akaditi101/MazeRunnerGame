import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import java.net.URL;
import java.awt.BorderLayout;
//import java.awt.event.*;


public class Runner {
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        second s = new second();
        //second s2 = new second(87, 83, 68, 65);
        //KeyEvent.VK_RIGHT
        
        try{
            URL url = new URL("https://openclipart.org/image/800px/246730");
            Image image = ImageIO.read(url);
            
            JLabel label = new JLabel(new ImageIcon(image));
            f.getContentPane().add(label, BorderLayout.CENTER);
            f.pack();
            f.setVisible(true);
            
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 600);
            }
            catch (Exception e)
            {}
            
            f.add(s);
           // f.add(s2); 
        
    }
}
