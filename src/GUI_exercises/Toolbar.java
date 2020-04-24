package GUI_exercises;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    public Toolbar(){
        helloButton=new JButton("Hello");
        goodbyeButton=new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);

    }

    public void actionPermormed(ActionEvent arg0){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("A button has been clicked");
    }

    public void setTextPanel(TextPanel textPanel) {
    }
}
