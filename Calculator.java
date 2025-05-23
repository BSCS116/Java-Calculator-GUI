import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JButton [] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;

    JPanel panel = new JPanel();
    Font myFont = new Font("InkFree", Font.BOLD, 30);




    Calculator(){

        frame = new JFrame ("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 525);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(0,25, 362, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;


        for (int i = 0; i < 8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);

        }
        for (int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(0, 430, 170,50);
        clrButton.setBounds(192, 430, 170, 50);

        panel = new JPanel();
        panel.setBounds(0, 100, 362, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.GRAY);
        functionButtons[0].setBackground(Color.yellow);
        functionButtons[1].setBackground(Color.yellow);
        functionButtons[2].setBackground(Color.yellow);
        functionButtons[3].setBackground(Color.yellow);
        functionButtons[4].setBackground(Color.yellow);
        functionButtons[5].setBackground(Color.GREEN);
        functionButtons[6].setBackground(Color.red);
        functionButtons[7].setBackground(Color.red);



        numberButtons[1].setBackground(Color.CYAN);
        numberButtons[2].setBackground(Color.CYAN);
        numberButtons[3].setBackground(Color.CYAN);
        numberButtons[3].setBackground(Color.CYAN);
        numberButtons[4].setBackground(Color.CYAN);
        numberButtons[5].setBackground(Color.CYAN);
        numberButtons[6].setBackground(Color.CYAN);
        numberButtons[7].setBackground(Color.CYAN);
        numberButtons[8].setBackground(Color.CYAN);
        numberButtons[9].setBackground(Color.CYAN);
        numberButtons[0].setBackground(Color.CYAN);






        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);




        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);


    }





    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }




}
