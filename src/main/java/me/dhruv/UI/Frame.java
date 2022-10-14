package me.dhruv.UI;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Taskbar.Feature;
import java.awt.Taskbar;

public class Frame extends JFrame {

    public Frame() {

         setIcons("../Icon.jpeg");

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MineSweeper");
        setLocationRelativeTo(null);
        setLocationByPlatform(true);

        setVisible(true);

    }

    private void setIcons(String path) {
        // windows & linux
        setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getResource(path)));

        // MacOS
        if (Taskbar.getTaskbar().isSupported(Feature.ICON_IMAGE)) {
            Taskbar.getTaskbar().setIconImage(
                    Toolkit.getDefaultToolkit().getImage(
                            Frame.class.getResource(
                                    path)));
        }
    }

}
