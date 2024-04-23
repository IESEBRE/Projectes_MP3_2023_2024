package org.example.controller;

import org.example.model.Alumne;
import org.example.model.Alumne.Matricula;
import org.example.model.Model;
import org.example.view.MatriculaView;
import org.example.view.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeSet;

public class Controller {

    private Model model;
    private MatriculaView view;

    public Controller(Model model, MatriculaView view) {
        this.model = model;
        this.view = view;

        lligaVistaModel();
    }

    private void lligaVistaModel() {

        //Fixem el model de la taula dels alumnes
        JTable taula = view.getTaula();
        taula.setModel(this.model.getModel());
        //Amago la columna que conté l'objecte alumne
        taula.getColumnModel().getColumn(3).setMinWidth(0);
        taula.getColumnModel().getColumn(3).setMaxWidth(0);
        taula.getColumnModel().getColumn(3).setPreferredWidth(0);

        //Fixem el model de la taula de matrícules
        JTable taulaMat = view.getTaulaMat();
        taulaMat.setModel(this.model.getModelMat());

        //Desactivem pestanyes del panel
        view.getPestanyes().setEnabledAt(1, false);
        view.getPestanyes().setTitleAt(1, "Matrícula de ...");

        //Forcem a que només se pugue seleccionar una fila de la taula
        taula.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Afegim listeners als objectes
        afegirListeners();

    }

    private void afegirListeners() {

        Model modelo = this.model;
        DefaultTableModel model = modelo.getModel();
        DefaultTableModel modelMat = modelo.getModelMat();
        JTable taula = view.getTaula();
        JTable taulaMat = view.getTaulaMat();
        JButton insertarButton = view.getInsertarButton();
        JButton modificarButton = view.getModificarButton();
        JButton borrarButton = view.getBorrarButton();
        JTextField campNom = view.getCampNom();
        JTextField campPes = view.getCampPes();
        JCheckBox caixaAlumne = view.getCaixaAlumne();
        JTabbedPane pestanyes = view.getPestanyes();

        //Botó insertar
        view.getInsertarButton().addActionListener(
                new ActionListener() {
                    /**
                     * Invoked when an action occurs.
                     *
                     * @param e the event to be processed
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JTextField campNom = view.getCampNom();
                        JTextField campPes = view.getCampPes();
                        JCheckBox caixaAlumne = view.getCaixaAlumne();

                        if (pestanyes.getSelectedIndex() == 0) {        //Si estem a la pestanya de l'alumne
                            //Comprovem que totes les caselles continguen informació
                            if (campNom.getText().isBlank() || campPes.getText().isBlank()) {
                                JOptionPane.showMessageDialog(null, "Falta omplir alguna dada!!");
                            } else {
                                try {
                                    NumberFormat num = NumberFormat.getNumberInstance(Locale.getDefault());   //Creem un número que entèn la cultura que utilitza l'aplicació
                                    double pes = num.parse(campPes.getText().trim()).doubleValue();  //intentem convertir el text a double
                                    if (pes < 1 || pes > 800) throw new ParseException("", 0);
                                    Alumne al = new Alumne(campNom.getText(), pes, caixaAlumne.isSelected(), new TreeSet<Matricula>());
                                    model.addRow(new Object[]{campNom.getText(), pes, caixaAlumne.isSelected(), al});
                                    campNom.setText("Pepito");
                                    campNom.setSelectionStart(0);
                                    campNom.setSelectionEnd(campNom.getText().length());
                                    campPes.setText("75");
                                    campNom.requestFocus();         //intentem que el foco vaigue al camp del nom
                                } catch (ParseException ex) {
                                    JOptionPane.showMessageDialog(null, "Has d'introduir un pes correcte (>=1 i <=800!!");
                                    campPes.setSelectionStart(0);
                                    campPes.setSelectionEnd(campPes.getText().length());
                                    campPes.requestFocus();
                                }
                            }
                        } else {         //Si estem a la pestanya de la matricula
                            //Obtinc l'alumne de la columna que conté l'objecte
                            Alumne al = (Alumne) model.getValueAt(taula.getSelectedRow(), 3);
                            Matricula m = new Matricula((Matricula.Modul) view.getComboMP().getSelectedItem(), Integer.parseInt(view.getCampNota().getText()));
                            al.getMatricules().add(m);
                            ompliMatricula(al, modelMat);


                        }


                    }
                }
        );

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
                int filaSel = taula.getSelectedRow();

                if (filaSel != -1) {        //Tenim una fila seleccionada
                    //Posem els valors de la fila seleccionada als camps respectius
                    campNom.setText(model.getValueAt(filaSel, 0).toString());
                    campPes.setText(model.getValueAt(filaSel, 1).toString().replaceAll("\\.", ","));
                    caixaAlumne.setSelected((Boolean) model.getValueAt(filaSel, 2));

                    //Activem la pestanya de la matrícula de l'alumne seleccionat
                    view.getPestanyes().setEnabledAt(1, true);
                    view.getPestanyes().setTitleAt(1, "Matrícula de " + campNom.getText());

                    //Posem valor a el combo d'MPs
                    view.getComboMP().setModel(modelo.getComboBoxModel());
                    ompliMatricula((Alumne) model.getValueAt(filaSel, 3),modelMat);
                } else {                  //Hem deseleccionat una fila
                    //Posem els camps de text en blanc
                    campNom.setText("");
                    campPes.setText("");

                    //Desactivem pestanyes
                    view.getPestanyes().setEnabledAt(1, false);
                    view.getPestanyes().setTitleAt(1, "Matrícula de ...");
                }
            }
        });
    }

    private static void ompliMatricula(Alumne al,DefaultTableModel modelMat) {
        //Omplim el model de la taula de matrícula de l'alumne seleccionat
        modelMat.setRowCount(0);
        // Fill the table model with data from the collection
        for (Matricula matricula : al.getMatricules()) {
            modelMat.addRow(new Object[]{matricula.getModul(), matricula.getNota()});
        }
    }
}
