package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        super("myLab");
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(new TextToCombo());
        container.add(new TextToButtonAndSwap());
        container.add(new TextRadioCheck());
        container.add(new TextCheckCheck());
        container.add(new TextToTableAndSwap());
        container.add(new MakeTableAndStopStartMoving());
        add(container);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Main fdf = new Main();
    }

}
