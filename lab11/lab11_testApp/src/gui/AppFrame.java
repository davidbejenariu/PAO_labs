package gui;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private JPanel northPanel;
    private JLabel textLabel;
    private JTextField textField;
    private JButton textButton;
    private JList productList;
    private DefaultListModel<String> listModel;

    public AppFrame() {
        northPanel = new JPanel();
        textLabel = new JLabel("Product:");
        // setam lungimea text field-ului in nr de caractere
        textField = new JTextField(10);
        textButton = new JButton("Add");
        productList = new JList();
        listModel = new DefaultListModel<>();

        add(northPanel, BorderLayout.NORTH);
        northPanel.add(textLabel);
        northPanel.add(textField);
        northPanel.add(textButton);
        productList.setModel(listModel);
        add(productList);

        textButton.addActionListener(ev -> {
            String text = textField.getText();
            listModel.addElement(text);
            textField.setText("");
        });

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Test App");
        setVisible(true);
    }
}
