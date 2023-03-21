import javax.swing.*;
import java.awt.*;

public class GameFrame {
    JFrame frame;
    Table table;
    GameFrame()
    {
        frame = new JFrame("Pong Game");


        // Creating Panel or Table
        table = new Table();
        table.setBackground(Color.black);

        // Adding the table to my frame
        frame.add(table);

        // for frame

        frame.setResizable(false);
        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
}
