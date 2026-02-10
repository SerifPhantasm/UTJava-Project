import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UT_Main {

    // base
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
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

        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(150, 200, 400, 200);
        outputArea.setEditable(false);
        outputArea.setBackground(Color.BLACK);
        outputArea.setForeground(Color.WHITE);
        JScrollPane outputScroll = new JScrollPane(outputArea);

        JButton process_connect = new JButton("Set");
        process_connect.setBackground(Color.BLACK);
        process_connect.setForeground(Color.WHITE);
        process_connect.setBounds(350, 10, 100, 30);
        process_connect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IntegrityCheck(outputArea, username);
            }
        });





        credits.setBounds(350, 500, 100, 30);

        frame.add(credits);
        frame.add(process_connect);
        frame.add(outputArea);
        frame.add(outputScroll);

        frame.setVisible(true);
    }

    public static void IntegrityCheck(JTextArea outputArea, String username)
    {
        String gamePath = findGamePath();

        outputArea.setText(username + "\n");
        if (gamePath != null)
        {
            JOptionPane.showMessageDialog(null, "Game found at: " + gamePath);
            outputArea.append("//" + "\n" + "Path: " + gamePath + "\n");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Make sure you have UNDERTALE Installed");
            outputArea.append("UNDERTALE directory not FOUND." + "\n");
        }
    }

    public static String findGamePath()
    {
        String UserName = System.getProperty("user.name");
        String[] gamePath_List = {
            "C:\\Users\\" + UserName + "\\Downloads\\Undertale\\undertale.exe",
            "C:\\Users\\" + UserName + "\\Desktop\\Undertale\\undertale.exe",
            "C:\\Users\\" + UserName + "\\Documents\\Undertale\\undertale.exe",
            "C:\\Program Files\\Undertale\\undertale.exe",
            "C:\\Program Files (x86)\\Undertale\\undertale.exe"
        };

        for (String path : gamePath_List)
        {
            java.io.File file = new java.io.File(path);
            if (file.exists())
            {
                System.out.println("Found game at: " + path);
                return path;
            }
        }
        System.out.println("Game not found in any path.");
        return null;
    }
}