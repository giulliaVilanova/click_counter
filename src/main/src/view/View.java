package view;

import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;

public class View extends JFrame {
    private JLabel labelCounter;
    private JButton buttonCounter;
    private JButton buttonReset;

    public View() {
        setTitle("Click Counter:");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        labelCounter = new JLabel("Counter: 0", SwingConstants.CENTER);
        buttonCounter = new JButton("Click");
        buttonReset = new JButton("Reset");

        add(labelCounter, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buttonCounter);
        buttonPanel.add(buttonReset);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void updateCounter(int counter) {
        labelCounter.setText("Counter: " + counter);
    }

    public JButton getButtonCounter() {
        return buttonCounter;
    }

    public JButton getButtonReset() {
        return buttonReset;
    }
}
