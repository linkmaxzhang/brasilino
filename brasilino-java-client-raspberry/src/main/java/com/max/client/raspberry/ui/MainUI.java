package com.max.client.raspberry.ui;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class MainUI {
    private JPanel jpanel;
    private JTextPane infoText;
    private JButton button1;
    private JButton button2;
    private JTextPane consolText;

    public void initView() {
        JFrame frame = new JFrame();
        frame.setTitle("测试");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(jpanel);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void showSysInfo(String info) {
        try {
            infoText.getDocument().insertString(0, info, null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }


    public void appendConsolInfo(String info) {
        Document doc = consolText.getDocument();
        try {
            doc.insertString(doc.getLength(), "\n", null);
            doc.insertString(doc.getLength(), info, null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

}
