import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UT_Main {

    // base
    public static void main(String[] args) {

        JFrame frame = new JFrame("UT Project");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);

        JButton credits = new JButton("About");
        credits.setBackground(Color.BLACK);
        credits.setForeground(Color.WHITE);

        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Ver 0");
            }
        });


        JButton process_connect = new JButton("Set");
        process_connect.setBackground(Color.BLACK);
        process_connect.setForeground(Color.WHITE);





        credits.setBounds(350, 500, 100, 30);

        frame.add(credits);

        frame.setVisible(true);
    }
// test
    public static void IntegrityCheck() {
        String yourPath = "";
    }
}