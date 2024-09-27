import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Catch extends JPanel implements ActionListener {
    JFrame frame;
    JButton button;
    final int width = 637;
    final int height = 394;
    //Image squirtle;
    Image Charmander;
    Image grassField;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    Catch(){
        this.setPreferredSize(new Dimension(width,height));
        //this.setBackground(Color.green);
        //squirtle = new ImageIcon("ゼニガメ.png").getImage();
        Charmander = new ImageIcon("ヒトカゲ.png").getImage();
        grassField = new ImageIcon("grassfield.png").getImage();
        timer = new Timer(0, this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(grassField, 0, 0,null);
        g2D.drawImage(Charmander, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= width - Charmander.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();

        if(y >= height - Charmander.getHeight(null) || x<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
        //y = y + yVelocity;

        if(x >= width - Charmander.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();

    }
}
