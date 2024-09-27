import javax.swing.*;
import java.awt.*;

public class CatchFrame extends JFrame {
    Catch catchPanel;

    CatchFrame(){
        catchPanel = new Catch();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(catchPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
