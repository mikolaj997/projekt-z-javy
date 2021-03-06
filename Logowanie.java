package com.company.zadanie8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Logowanie extends JFrame implements ActionListener {
    JTextField tfUzytkownik;
    JTextField tfHaslo;
    JButton btnOK;
    JButton btnAnuluj;

    public Logowanie() {
        super("Logowanie");
        tfUzytkownik = new JTextField("");
        tfHaslo = new JTextField("");
        btnOK = new JButton("Ok");
        btnAnuluj = new JButton("Anuluj");
        btnOK.addActionListener(this);
        btnAnuluj.addActionListener(this);

        JPanel p1 = new JPanel(new GridLayout(3,2));
        p1.add(new JLabel("Uzytkownik:"));
        p1.add(tfUzytkownik);
        p1.add(new JLabel("Haslo:"));
        p1.add(tfHaslo);
        p1.add(btnAnuluj);
        p1.add(btnOK);

        setContentPane(p1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 150);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Anuluj")) {
            dispose();
        } else if (e.getActionCommand().equals("Ok")) {
            if (tfUzytkownik.getText().equals("admin") && (tfHaslo.getText().equals("admin"))) {
                JOptionPane.showMessageDialog(this, "Logowanie pomyślne", "Logowanie",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Logowanie nieudane", "Logowanie",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Logowanie::new);
    }
}