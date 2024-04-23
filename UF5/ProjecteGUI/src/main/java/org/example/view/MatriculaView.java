package org.example.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MatriculaView extends JFrame{
    private JTabbedPane pestanyes;
    private JTable taula;
    private JScrollPane scrollPane1;
    private JButton insertarButton;
    private JButton modificarButton;
    private JButton borrarButton;
    private JTextField campNom;
    private JTextField campPes;
    private JCheckBox caixaAlumne;
    private JPanel panel;
    private JTable taulaMat;
    private JComboBox comboMP;
    private JTextField campNota;
    //private JTabbedPane PanelPestanya;

    //Getters


    public JTable getTaulaMat() {
        return taulaMat;
    }

    public JComboBox getComboMP() {
        return comboMP;
    }

    public JTextField getCampNota() {
        return campNota;
    }

    public JTabbedPane getPestanyes() {
        return pestanyes;
    }

    public JTable getTaula() {
        return taula;
    }

    public JButton getBorrarButton() {
        return borrarButton;
    }

    public JButton getModificarButton() {
        return modificarButton;
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


    //Constructor de la classe
    public MatriculaView() {


        //Per poder vore la finestra
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

        private void createUIComponents() {
        // TODO: place custom component creation code here
        scrollPane1 = new JScrollPane();
        taula = new JTable();
        pestanyes = new JTabbedPane();
        taula.setModel(new DefaultTableModel());
        taula.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollPane1.setViewportView(taula);

    }
}
