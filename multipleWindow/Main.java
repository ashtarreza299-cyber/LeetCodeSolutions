import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static void main(String[] args) {

        JFrame f1 = new JFrame("Login");
        JFrame f2 = new JFrame("Hi");
        JButton button = new JButton("Open new Frame");

        int buttonWidth = 100;
        int buttonHeight = 30;

        button.setBounds((f1.getWidth() + buttonWidth)/2, (f1.getHeight()/2 + buttonHeight)/2, buttonWidth, buttonHeight);
        f1.setSize(500, 400);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);

        f2.setSize(500, 400);
        f2.setLocationRelativeTo(null);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLayout(null);


        f1.add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
            }
        });

        f1.setVisible(true);

    }

}