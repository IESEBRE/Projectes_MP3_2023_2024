package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista extends JFrame{
    private JPanel panel;
    private JTable taula;
    private JButton borrarButton;
    private JButton modificarButton;
    private JButton insertarButton;
    private JTextField campNom;
    private JTextField campPes;

    //Constructor de la classe
    public Vista(){
        //Per poder vore la finestra
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        //Anem a definir l'estructura de la taula
        DefaultTableModel model=new DefaultTableModel(new Object[]{"Nom","Pes"},0);
        taula.setModel(model);

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista();
            }
        });
    }


}
