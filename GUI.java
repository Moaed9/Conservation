
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class GUI extends JFrame {
    private JButton button = new JButton("Result");
    private JTextField input = new JTextField("", 5);
    private JRadioButton radio1 = new JRadioButton("Cucumbers");
    private JRadioButton radio2 = new JRadioButton("Tomatoes");
    private JRadioButton radio3 = new JRadioButton("Zucchini");
    private JRadioButton radio4 = new JRadioButton("squashes");
    private JRadioButton radio5 = new JRadioButton("Eggplants");
    private JRadioButton radio6 = new JRadioButton("Peppers");
    private JLabel output = new JLabel("Name the number of vegetables");

    public GUI() {
        super("Calculation");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground((new Color(0x5F1A47)));

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(output);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        group.add(radio5);
        group.add(radio6);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(radio3);
        container.add(radio4);
        container.add(radio5);
        container.add(radio6);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button.setSize(50, 50);
        button.setLocation(50, 50);
        button.setBackground(new Color(0xC8FFFF));
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = ("");
            if (radio1.isSelected()) {
                Scanner scr = new Scanner(input.getText());
                double a = scr.nextDouble();
                double clear = Math.floor(a);
                double mega = Math.floor(a / 150);
                double rst = Math.floor(a / 10);
                double r = 0;
                double s = a - rst * 10;
                double f = a - rst * 10;
                double t = 0;
                if (clear > 150) {
                    r = Math.floor((a - mega * 150) / 10);
                    if (s > 5) {
                        f = s - 5;
                        t = t + 1;
                    }
                }
                message += a + " cucumbers is : " + "\n";
                double h = t + rst * 2;
                if (clear > 150) {
                    message += mega + " Fifteen liter bottles:" + "\n";
                    message += r + " Liter cans:" + "\n";
                    message += t + " Half-liter cans:" + "\n";
                    message += "Cucumbers for food: " + f + "\n";
                    message += "Or" + "\n";
                }
                message += rst + " Liter cans:" + "\n";
                message += t + " Half-liter cans:" + "\n";
                message += "Cucumbers for food: " + f + "\n";
                message += "Or " + "\n";
                message += h + " Half-liter cans" + "\n";
                message += "Cucumbers for food " + f + "\n";
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);
            } else if (radio2.isSelected()) {
                Scanner scr = new Scanner(input.getText());
                double a = scr.nextDouble();
                double clear = Math.floor(a);
                double mega = Math.floor(a / 135);
                double rst = Math.floor(a / 9);
                double r = 0;
                double s = a - rst * 9;
                double f = a - rst * 9;
                double t = 0;
                if (clear > 135) {
                    r = Math.floor((a - mega * 135) / 9);
                    if (s > 5) {
                        f = s - 5;
                        t = t + 1;
                    }
                }
                message += a + " tomatoes is : " + "\n";
                double h = t + rst * 2;
                if (clear > 135) {
                    message += mega + " Fifteen liter bottles:" + "\n";
                    message += r + " Liter cans:" + "\n";
                    message += t + " Half-liter cans:" + "\n";
                    message += "Tomatoes for food: " + f + "\n";
                    message += "Or" + "\n";
                }
                message += rst + " Liter cans:" + "\n";
                message += t + " Half-liter cans:" + "\n";
                message += "Tomatoes for food: " + f + "\n";
                message += "Or " + "\n";
                message += h + " Half-liter cans:" + "\n";
                message += "Tomatoes for food " + f + "\n";
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);

            } else if (radio3.isSelected()) {
                Scanner scr = new Scanner(input.getText());
                double a = scr.nextDouble();
                double clear = Math.floor(a);
                double mega = Math.floor(a / 15);
                double rst = Math.floor(a);
                double r = 0;
                double s = a - rst;
                double f = a - rst;
                double t = 0;
                if (clear > 15) {
                    r = Math.floor((a - mega * 15));
                    if (s > 0.5) {
                        f = s - 0.5;
                        t = t + 1;
                    }
                }
                message += a + " zucchini is : " + "\n";
                double h = t + rst * 2;
                if (clear > 15) {
                    message += mega + " Fifteen liter bottles:" + "\n";
                    message += r + " Liter cans:" + "\n";
                    message += t + " Half-liter cans:" + "\n";
                    message += "Zucchini for food: " + f + "\n";
                    message += "Or" + "\n";
                }
                message += rst + " Liter cans:" + "\n";
                message += t + " Half-liter cans:" + "\n";
                message += "Zucchini for food: " + f + "\n";
                message += "Or " + "\n";
                message += h + " Half-liter cans:" + "\n";
                message += "Zucchini for food " + f + "\n";
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);
            } else if (radio4.isSelected()) {
                Scanner scr = new Scanner(input.getText());
                double a = scr.nextDouble();
                double clear = Math.floor(a);
                double mega = Math.floor(a / 30);
                double rst = Math.floor(a / 2);
                double r = 0;
                double s = a - rst * 2;
                double f = a - rst * 2;
                double t = 0;
                if (clear > 30) {
                    r = Math.floor((a - mega * 30) / 2);
                    if (s > 1) {
                        f = s - 1;
                        t = t + 1;
                    }
                }
                message += a + " Squashes is : " + "\n";
                double h = t + rst * 2;
                if (clear > 30) {
                    message += mega + " Fifteen liter bottles:" + "\n";
                    message += r + " Liter cans:" + "\n";
                    message += t + " Half-liter cans:" + "\n";
                    message += "Squashes for food: " + f + "\n";
                    message += "Or" + "\n";
                }
                message += rst + " Liter cans:" + "\n";
                message += t + " Half-liter cans:" + "\n";
                message += "Squashes for food: " + f + "\n";
                message += "Or " + "\n";
                message += h + " Half-liter cans:" + "\n";
                message += "Squashes for food " + f + "\n";
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);

            } else if (radio5.isSelected()) {
                Scanner scr = new Scanner(input.getText());
                double a = scr.nextDouble();
                double clear = Math.floor(a);
                double mega = Math.floor(a / 15);
                double rst = Math.floor(a);
                double r = 0;
                double s = a - rst;
                double f = a - rst;
                double t = 0;
                if (clear > 15) {
                    r = Math.floor((a - mega * 15));
                    if (s > 0.5) {
                        f = s - 0.5;
                        t = t + 1;
                    }
                }
                message += a + " Eggplants is is : " + "\n";
                double h = t + rst * 2;
                if (clear > 15) {
                    message += mega + " Fifteen liter bottles:" + "\n";
                    message += r + " Liter cans:" + "\n";
                    message += t + " Half-liter cans:" + "\n";
                    message += "Eggplants for food: " + f + "\n";
                    message += "Or" + "\n";
                }
                message += rst + " Liter cans:" + "\n";
                message += t + " Half-liter cans:" + "\n";
                message += "Eggplants for food: " + f + "\n";
                message += "Or " + "\n";
                message += h + " Half-liter cans:" + "\n";
                message += "Eggplants for food " + f + "\n";
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);

            } else if (radio6.isSelected()) {
                Scanner scr = new Scanner(input.getText());
                double a = scr.nextDouble();
                double clear = Math.floor(a);
                double mega = Math.floor(a / 75);
                double rst = Math.floor(a / 5);
                double r = 0;
                double t = 0;
                double s = a - rst * 5;
                double f = a - rst * 5;
                if (clear > 75) {
                    r = Math.floor((a - mega * 15));
                    if (s > 3) {
                        f = s - 3;
                        t = t + 1;
                    }
                }
                message += a + " Peppers  is : " + "\n";
                double h = t + rst * 2;
                if (clear > 75) {
                    message += mega + " Fifteen liter bottles:" + "\n";
                    message += r + " Liter cans:" + "\n";
                    message += t + " Half-liter cans:" + "\n";
                    message += "Peppers for food: " + f + "\n";
                    message += "Or" + "\n";
                }
                message += rst + " Liter cans:" + "\n";
                message += t + " Half-liter cans:" + "\n";
                message += "Peppers for food: " + f + "\n";
                message += "Or " + "\n";
                message += h + " Half-liter cans:" + "\n";
                message += "Peppers for food " + f + "\n";
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}