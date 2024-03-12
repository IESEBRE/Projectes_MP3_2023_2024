package org.example;

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

    //Constructor de la classe
    public Vista(){
        //Definim la cultura de la nostra aplicació
        Locale.setDefault(new Locale("ca","ES"));

        //Per poder vore la finestra
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        //Anem a definir l'estructura de la taula
        DefaultTableModel model=new DefaultTableModel(new Object[]{"Nom","Pes","És alumne?"},0){
            /**
             * Returns true regardless of parameter values.
             *
             * @param row    the row whose value is to be queried
             * @param column the column whose value is to be queried
             * @return true
             * @see #setValueAt
             */
            @Override
            public boolean isCellEditable(int row, int column) {

                //Fem que TOTES les cel·les de la columna 1 de la taula es puguen editar
                if(column==1) return true;
                return false;
            }

            //Permet definir el tipo de cada columna
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return Double.class;
                    case 2:
                        return Boolean.class;
                    default:
                        return Object.class;
                }
            }
        };




        taula.setModel(model);

        //Forcem a que només se pugue seleccionar una fila de la taula
        taula.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        //LLegim el fitxer de dades i omplim la taula...
//        while(true) {
//            Pojo objecte=(Pojo)entrada.readObject();
//            model.addRow(new Object[]{objecte.getNom(), pes, caixaAlumne.isSelected()});
//
//        }


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
                    try{
                        NumberFormat num=NumberFormat.getNumberInstance(Locale.getDefault());   //Creem un número que entèn la cultura que utilitza l'aplicació
                        double pes= num.parse(campPes.getText().trim()).doubleValue();  //intentem convertir el text a double
                        if(pes<1 || pes>800) throw new ParseException("",0);
                        model.addRow(new Object[]{campNom.getText(),pes,caixaAlumne.isSelected()});
                        campNom.setText("Pepito");
                        campNom.setSelectionStart(0);
                        campNom.setSelectionEnd(campNom.getText().length());
                        campPes.setText("75");
                        campNom.requestFocus();         //intentem que el foco vaigue al camp del nom
                    }catch(ParseException ex){
                        JOptionPane.showMessageDialog(null, "Has d'introduir un pes correcte (>=1 i <=800!!");
                        campPes.setSelectionStart(0);
                        campPes.setSelectionEnd(campPes.getText().length());
                        campPes.requestFocus();
                    }
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
                int filaSel=taula.getSelectedRow();

                if(filaSel!=-1){        //Tenim una fila seleccionada
                    //Posem els valors de la fila seleccionada als camps respectius
                    campNom.setText(model.getValueAt(filaSel,0).toString());
                    campPes.setText(model.getValueAt(filaSel,1).toString().replaceAll("\\.",","));
                    caixaAlumne.setSelected((Boolean)model.getValueAt(filaSel,2));
                }else{                  //Hem deseleccionat una fila
                    //Posem els camps de text en blanc
                    campNom.setText("");
                    campPes.setText("");
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mirem si tenim una fila de la taula seleccionada
                int filaSel=taula.getSelectedRow();

                if(filaSel!=-1){
                    model.removeRow(filaSel);
                    //Posem els camps de text en blanc
                    campNom.setText("");
                    campPes.setText("");
                }
                else JOptionPane.showMessageDialog(null, "Per borrar una fila l'has de seleccionar a la taula");
            }
        });
        modificarButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mirem si tenim una fila de la taula seleccionada
                int filaSel=taula.getSelectedRow();

                if(filaSel!=-1){
                    //Abans de modoficar comprovem que tenim els camps omplits
                    //Comprovem que totes les caselles continguen informació
                    if(campNom.getText().isBlank() || campPes.getText().isBlank()){
                        JOptionPane.showMessageDialog(null,"Falta omplir alguna dada!!");
                    }
                    else{
                        model.removeRow(filaSel);
                        model.insertRow(filaSel, new Object[]{Double.valueOf(campPes.getText()),caixaAlumne.isSelected()});
                        //Posem els camps de text en blanc
                        campNom.setText("");
                        campPes.setText("");
                        campNom.requestFocus();         //intentem que el foco vaigue al camp del nom
                    };




                }
                else JOptionPane.showMessageDialog(null, "Per modificar una fila l'has de seleccionar a la taula");
            }
        });

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



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista();
            }
        });
    }


}
