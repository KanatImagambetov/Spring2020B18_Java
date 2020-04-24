package GUI_exercises;

import javax.swing.*;

public class Example01 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
//                JFrame frame=new JFrame("Hello World");
//                frame.setSize(600,300);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
            }
        });
    }
}
