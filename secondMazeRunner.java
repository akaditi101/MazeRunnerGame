import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.net.URL;
import java.awt.image.BufferedImage;


public class second extends JPanel implements ActionListener, KeyListener
{
    Timer t = new Timer(0, this);
    double x = 10, y = 10, a = 60, b = 10, vela = 0, velb = 0, velx = 0, vely = 0;
    int up, down, right, left;

    public second()
    {
        t.start();
        
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }
    BufferedImage img = null;
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //start
        
        try{
        URL url = new URL("https://openclipart.org/image/800px/246730");
            BufferedImage image = ImageIO.read(url);
            g2.drawImage(image, 0, 0, null);
            img = image;
            
            
        }
        catch(Exception e){
            img = null;
        }
        


        //end
        Color red = new ColorUIResource(200, 0, 0);
        g2.setColor(red);
        
        System.out.println(img.getRGB((int)x,(int) y));
        // if (img.getRGB((int)x,(int) y) != 0 || img.getRGB((int)x+5,(int) y) != 0 || img.getRGB((int)x,(int) y+5) != 0)
        // {
        //     System.out.println("die");
        //     x = x-velx;
        //     y = y-vely;
        //     velx= 0;
        //     vely = 0;
            
            
        // }

        if (velx == 0 && vely < 0)
        {
            if (img.getRGB((int) x, (int)y-1 ) != 0|| img.getRGB((int) x+40, (int)y-1 ) != 0 || img.getRGB((int) x, (int)y-6 ) != 0|| img.getRGB((int) x+40, (int)y-6 ) != 0)
            {
                //y=y-vely;
                velx = 0;
                vely=0;
                
            }
        }
        else if (vely != 0)
        {
            if (img.getRGB((int) x, (int)y+41 ) != 0|| img.getRGB((int) x+40, (int)y+41 ) != 0 || img.getRGB((int) x, (int)y+48 ) != 0|| img.getRGB((int) x+40, (int)y+48 ) != 0)
            {
                
               // y=y-vely;
                velx = 0;
                vely=0;
                
            }
        }
        
        else if (velx <0 && vely == 0)
        {
          if (img.getRGB((int) x-1, (int)y ) != 0 || img.getRGB((int) x-1, (int)y+40 ) != 0 || img.getRGB((int) x-6, (int)y ) != 0 || img.getRGB((int) x-6, (int)y+40 ) != 0 )
            {
                //x=x-vely;
                velx = 0;
                vely=0;
                
            }
        }
        else if (velx > 0)
        {
            if (img.getRGB((int) x+41, (int)y ) != 0 || img.getRGB((int) x+41, (int)y+40 ) != 0|| img.getRGB((int) x+46, (int)y+40 ) != 0|| img.getRGB((int) x+46, (int)y ) != 0)
            {
                //x=x-vely;
                velx = 0;
                vely=0;
                //System.out.println("yesssssssssss");
                
            }
        } 
        
        if ((x <= 35) && (750 < y)) {
            System.out.println("player one wins!");
            stop();
            stop2();
        }
        if ((x == 190 && y == 130) || (((x == 350) || (x == 360)) && y == 580) || (x == 410 && y == 290)
                || (x == 640 && y == 530)) {
            stop2();

        }
        if (( a <= 35) && (750 < b)) {
            System.out.println("player two wins!");
            stop();
            stop2();
        }
        if ((a == 190 && b == 130) || (((a == 350) || (a == 360)) && b == 580) || (a == 410 && b == 290)
                || (a == 640 && b == 530)) {
            stop();
        }

        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
        //second ellipse
        Color c = new ColorUIResource(0, 0, 200);
        g2.setColor(c);
        if (vela == 0 && velb < 0)
        {
            if (img.getRGB((int) a, (int)b-1 ) != 0|| img.getRGB((int) a+40, (int)b-1 ) != 0 || img.getRGB((int) a, (int)b-6 ) != 0|| img.getRGB((int) a+40, (int)b-6 ) != 0)
            {
                //y=y-vely;
                vela = 0;
                velb=0;
                
            }
        }
        else if (velb != 0)
        {
            if (img.getRGB((int) a, (int)b+41 ) != 0|| img.getRGB((int) a+40, (int)b+41 ) != 0 || img.getRGB((int) a, (int)b+48 ) != 0|| img.getRGB((int) a+40, (int)b+48 ) != 0)
            {
                
               // y=y-vely;
                vela = 0;
                velb=0;
                
            }
        }
        
        else if (vela <0 && velb == 0)
        {
          if (img.getRGB((int) a-1, (int)b ) != 0 || img.getRGB((int) a-1, (int)b+40 ) != 0 || img.getRGB((int) a-6, (int)b ) != 0 || img.getRGB((int) a-6, (int)b+40 ) != 0 )
            {
                //x=x-vely;
                vela = 0;
                velb=0;
                
            }
        }
        else if (vela > 0)
        {
            if (img.getRGB((int) a+41, (int)b ) != 0 || img.getRGB((int) a+41, (int)b+40 ) != 0|| img.getRGB((int) a+46, (int)b+40 ) != 0|| img.getRGB((int) a+46, (int)b ) != 0)
            {
                //x=x-vely;
                vela = 0;
                velb=0;
                System.out.println("yesssssssssss");
                
            }
        }
        g2.fill(new Ellipse2D.Double(a, b, 40, 40));
        Color yellow = new ColorUIResource(255, 255, 0);
        g2.setColor(yellow);
         g2.fill(new Ellipse2D.Double(191, 120, 30, 30));
         g2.fill(new Ellipse2D.Double(400, 290, 30, 30));
         g2.fill(new Ellipse2D.Double(345, 579, 30, 30));
         g2.fill(new Ellipse2D.Double(625, 520, 30, 30));
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
        
        x += velx;
        y += vely;
        a += vela;
        b += velb;
        
        if ((x > 35) && (750 < y)) {
            System.out.println("player one wins!");
            stop();
            stop2();
        }
        if (((x >= 170) && (x <= 210) && (y >= 110) && (y <= 150))|| ((x >= 395) && (x <= 435) && (y >= 270) && (y <= 310)) || ((x >= 335) && (x <= 375) && (y >= 560) && (y <= 600)) || ((x >= 620) && (x <= 660) && (y >= 510) && (y <= 550))) {
            stop2();

        }
        if ((a >= 15 && a <= 35) && (750 < b)) {
            System.out.println("player two wins!");
            stop();
            stop2();
        }
        if ((((a >= 170) && (a <= 210) && (b >= 110) && (b <= 150))|| ((a >= 395) && (a <= 435) && (b >= 270) && (b <= 310)) || ((a >= 335) && (a <= 375) && (b >= 560) && (b <= 600)) || ((a >= 620) && (a <= 660) && (b >= 510) && (b <= 550)))) {
            stop();
        }
        
        
    }

    public void up()
    {
       
        vely = -5;
        velx = 0;
        
    }

    public void down()
    {
        
        
            vely = 5;
            velx = 0;
        
        
    }

    public void left()
    {
        
            velx = -5;
            vely = 0;
       
        
    }

    public void right()
    {
        velx = 5;
        vely = 0;
        
        
       
    }
    
    public void stop() {
        velx = 0;
        vely = 0;
      
    }
   

    public void up2()
    {
        velb = -5;
        vela = 0;
    }

    public void down2()
    {
        velb = 5;
        vela = 0;
    }

    public void left2()
    {
        vela = -5;
        velb = 0;
    }

    public void right2()
    {
        vela = 5;
        velb = 0;
    }
    
    public void stop2() {
        vela = 0;
        velb = 0;
    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            up();
        }
        if (code == KeyEvent.VK_DOWN){
            down();
        }
        if (code == KeyEvent.VK_LEFT){
            left();
        }
        if (code == KeyEvent.VK_RIGHT){
            right();
        }
        if (code == KeyEvent.VK_W){
            up2();
        }
        if (code == KeyEvent.VK_S){
            down2();
        }
        if (code == KeyEvent.VK_A){
            left2();
        }
        if (code == KeyEvent.VK_D){
            right2();
        }
        if (code == KeyEvent.VK_SPACE){
            velx=0;
            vely= 0;
        }
        if (code == KeyEvent.VK_SHIFT){
            vela=0;
            velb= 0;
        }
    }

    public boolean inside(int c, int d)
    {
        boolean val = false;
       // if ()
        
        
        return true;
    }

    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}
