package top.niqiu.ui;

import javax.swing.*;
import javax.swing.text.TextAction;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button = new JButton("nmsl");
        panel.add(button);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
