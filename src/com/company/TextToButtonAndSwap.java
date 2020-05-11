package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextToButtonAndSwap extends JPanel {
    private JTextField Field;
    private JButton ButtonOne;
    private JButton ButttonTwo;

    public TextToButtonAndSwap() {
        super(new GridLayout(0, 4));
        setBackground(Color.red);
        JLabel label = new JLabel("Text to button and swap");
        Field = new JTextField(12);
        ButtonOne = new JButton("get Text");
        ButtonOne.addActionListener(new groupTwoButL());
        ButttonTwo = new JButton("swap");
        ButttonTwo.addActionListener(new groupTwoBut2L());
        add(label);
        add(Field);
        add(ButtonOne);
        add(ButttonTwo);

    }

    class groupTwoButL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            ButttonTwo.setText(Field.getText());
        }
    }

    class groupTwoBut2L implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String swapper = ButtonOne.getText();
            ButtonOne.setText(ButttonTwo.getText());
            ButttonTwo.setText(swapper);
        }
    }
}
