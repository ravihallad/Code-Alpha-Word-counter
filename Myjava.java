import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Myjava extends JFrame implements ActionListener {
    JLabel lb1, lb2;
    JTextArea ta;
    JButton b;
    JButton pad, text;

    Myjava() {
        super("Char Word Count Tool - JTP");
        lb1 = new JLabel("Number of Characters is : ");
        lb1.setBounds(50, 50, 100, 20);
        lb2 = new JLabel("Number of words is: ");
        lb2.setBounds(200, 50, 100, 20);
        this.getContentPane().setBackground(new Color(0xA9A9A9));

        ta = new JTextArea( );
        ta.setBounds(50, 110, 300, 200);

        b = new JButton("Submit");
        b.setBounds(50, 320, 80, 30);// x,y,w,h
        b.addActionListener(this);

        pad = new JButton("PadColor");
        pad.setBounds(140, 320, 95, 30);// x,y,w,h
        pad.addActionListener(this);

        text = new JButton("TextColor");
        text.setBounds(260, 320, 95, 30);// x,y,w,h
        text.addActionListener(this);

        add(lb1);
        add(lb2);
        add(ta);
        add(b);
        add(pad);
        add(text);

        setSize(400, 400);
        setLayout(null);// using no layout manager
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String text = ta.getText();
            lb1.setText("Characters: " + text.length());
            String words[] = text.split("\\s");
            lb2.setText("words: " + words.length);
        } else if (e.getSource() == pad) {
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            ta.setBackground(c);
        } else if (e.getSource() == text) {
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            ta.setForeground(c);
        }
    }

    public static void main(String[] args) {
        new Myjava();
    }
}