import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JFrame message;
    JButton ball;
    //JLabel label;
    MyFrame(){

        message = new JFrame("Gotta them all !!!!!");
        ball = new JButton(new ImageIcon("PokeBall.png"));
        //message.getContentPane().add(ball);
        //message.pack();
        //message.setVisible(true);
        ball.setBounds(90, 80, 300,300);
        ball.addActionListener(this);
        //label.setText("Click the PokeBall to start the game");
        //ball.setForeground(Color.orange);
        ball.setBackground(Color.gray);
        ball.setBorder(BorderFactory.createEtchedBorder());

        message.add(ball);
        message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        message.setLayout(null);
        message.setSize(500,500);
        message.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ball){
            message.dispose();
            System.out.println("neko");
            new CatchFrame();
        }
    }
}
