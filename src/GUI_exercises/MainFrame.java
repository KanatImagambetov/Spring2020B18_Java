package GUI_exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private JButton btn;
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello World");

        setLayout(new BorderLayout());

        toolbar=new Toolbar();
        textPanel=new TextPanel();
        btn=new JButton("Click Me!");

        toolbar.setTextPanel(textPanel);

        btn.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent argO) {
                textPanel.appendText("Hello\n");
            }
        });
        add(toolbar, BorderLayout.NORTH);

        add(textPanel, BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);

        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
