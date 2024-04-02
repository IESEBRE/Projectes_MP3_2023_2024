package org.example.controller;

import org.example.app.LaMeuaExcepcio;
import org.example.model.Model;
import org.example.view.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Controller {

    private Model model;
    private Vista view;

    public Controller(Model model, Vista view) throws LaMeuaExcepcio {
        this.model = model;
        this.view = view;

        //Mètode per lligar la vista i el model
        lligarVistaModel();

        //Assigno el codi dels listeners
        assignarCodiListeners();
    }

    private void assignarCodiListeners() throws LaMeuaExcepcio {


        DefaultTableModel model=this.model.getModel();

        JButton insertarButton=view.getInsertarButton();
        JButton borrarButton=view.getBorrarButton();
        JButton modificarButton=view.getModificarButton();

        JTextField campNom=view.getCampNom();
        JTextField campPes=view.getCampPes();
        JCheckBox caixaAlumne=view.getCaixaAlumne();

        JTable taula=view.getTaula();


        insertarButton.addActionListener(
                new ActionListener() {
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
                }
        );

        borrarButton.addActionListener(
                new ActionListener() {
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
                }
        );

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
        throw new LaMeuaExcepcio(1,"Ha petat la base de dades");

    }

    private void lligarVistaModel() {
        //Obtinc els objectes de la vista
        JTable taula=view.getTaula();

        //Obtinc els objectes del model
        DefaultTableModel model=this.model.getModel();
        taula.setModel(model);

        //Forcem a que només se pugue seleccionar una fila de la taula
        taula.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


    }
}
