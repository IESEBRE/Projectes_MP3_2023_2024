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


        //LLegim el fitxer de dades i omplim la taula...
//        while(true) {
//            Pojo objecte=(Pojo)entrada.readObject();
//            model.addRow(new Object[]{objecte.getNom(), pes, caixaAlumne.isSelected()});
//
//        }


//        taula.addMouseListener(new MouseAdapter() {
//            /**
//             * {@inheritDoc}
//             *
//             * @param e
//             */
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//
//                //Al seleccionar la taula omplim els camps de text en els valors de la fila seleccionada
//                int filaSel=taula.getSelectedRow();
//
//                if(filaSel!=-1){        //Tenim una fila seleccionada
//                    //Posem els valors de la fila seleccionada als camps respectius
//                    campNom.setText(model.getValueAt(filaSel,0).toString());
//                    campPes.setText(model.getValueAt(filaSel,1).toString().replaceAll("\\.",","));
//                    caixaAlumne.setSelected((Boolean)model.getValueAt(filaSel,2));
//                }else{                  //Hem deseleccionat una fila
//                    //Posem els camps de text en blanc
//                    campNom.setText("");
//                    campPes.setText("");
//                }
//            }
//        });

        this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

                //Aquí haurem de guardar les dades de la taula al fitxer
                System.out.println("Estic sortint!!");
            }
        });


        campPes.addFocusListener(new FocusAdapter() {
            /**
             * Invoked when a component loses the keyboard focus.
             *
             * @param e
             */
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);

                //Comprovem que el valor introduït és el d'un pes correcte
                try{
                    NumberFormat num=NumberFormat.getNumberInstance(Locale.getDefault());   //Creem un número que entèn la cultura que utilitza l'aplicació
                    double pes= num.parse(campPes.getText().trim()).doubleValue();  //intentem convertir el text a double
                    if(pes<1 || pes>800) throw new ParseException("",0);
                    //campPes.setText(campPes.getText().replaceAll(".",""));  //eliminem los punts del número decimal
                }catch(ParseException ex){
                    JOptionPane.showMessageDialog(null, "Has d'introduir un pes correcte (>=1 i <=800!!");
                    campPes.setSelectionStart(0);
                    campPes.setSelectionEnd(campPes.getText().length());
                    campPes.requestFocus();

                }
            }
        });
    }






}
