package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        //Forcem a que només se pugue seleccionar una fila de la taula
        taula.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        insertarButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Comprovem que totes les caselles continguen informació
                if(campNom.getText().isBlank() || campPes.getText().isBlank()){
                    JOptionPane.showMessageDialog(null,"Falta omplir alguna dada!!");
                }
                else{
                    model.addRow(new Object[]{campNom.getText(),campPes.getText()});
                    campNom.setText("Pepito");
                    campNom.setSelectionStart(0);
                    campNom.setSelectionEnd(campNom.getText().length());
                    campPes.setText("75");
                    campNom.requestFocus();         //intentem que el foco vaigue al camp del nom
                };
            }
        });
        taula.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                //Al seleccionar la taula omplim els camps de text en els valors de la fila seleccionada
            }
        });
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
