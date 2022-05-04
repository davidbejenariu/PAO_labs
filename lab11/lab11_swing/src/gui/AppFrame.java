package gui;

import javax.swing.*;

public class AppFrame extends JFrame {
    private JMenuBar bar;
    private JMenu menu;
    private JMenuItem menuItem;

    public AppFrame() {
        bar = new JMenuBar();
        menu = new JMenu("File");
        menuItem = new JMenuItem("Exit");

        setJMenuBar(bar);
        bar.add(menu);
        menu.add(menuItem);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lab 11");
        setVisible(true);
    }
}
