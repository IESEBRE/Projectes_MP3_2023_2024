package org.example.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Vista extends JFrame{
    private JPanel panel;
    private JTable taula;
    private JButton borrarButton;
    private JButton modificarButton;
    private JButton insertarButton;
    private JTextField campNom;
    private JTextField campPes;
    private JCheckBox caixaAlumne;

    //Getters dels objectes de la vista
    public JTable getTaula() {
        return taula;
    }

    public JButton getInsertarButton() {
        return insertarButton;
    }

    public JTextField getCampNom() {
        return campNom;
    }

    public JTextField getCampPes() {
        return campPes;
    }

    public JCheckBox getCaixaAlumne() {
        return caixaAlumne;
    }

    public JButton getBorrarButton() {
        return borrarButton;
    }

    public JButton getModificarButton() {
        return modificarButton;
    }

    //Constructor de la classe
    public Vista(){

        //Per poder vore la finestra
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);


    }






}
