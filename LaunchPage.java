import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton start;

    LaunchPage(){
        start = new JButton("Game Start !");
        start.setBounds(100, 160, 200,40);
        start.setFocusable(false);
        start.addActionListener(this); //moveToAnotherWindow
        start.setFont(new Font("Open Sans",Font.BOLD, 15));
        start.setIconTextGap(-25);
        start.setForeground(Color.orange);
        start.setBackground(Color.gray);
        start.setBorder(BorderFactory.createEtchedBorder());

        frame.add(start);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start){
            frame.dispose();
            System.out.println("Catch them all!!!!!");
            MyFrame ball = new MyFrame();
        }

    }
}
