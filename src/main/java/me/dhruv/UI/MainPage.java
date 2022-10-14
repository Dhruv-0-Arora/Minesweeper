package me.dhruv.UI;

import javax.swing.*;
import java.awt.*;

public class MainPage extends JPanel {
    private Frame frame;
    private JComponent content;

    public MainPage(Frame frame, JComponent content) {
        this.frame = frame;
        this.content = content;
    }

    @Override
    protected void paintComponent(Graphics g) {

    }
}