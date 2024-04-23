package org.example.model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Model {

    private DefaultTableModel model;
    private TableColumn objecte;
    private DefaultTableModel modelMat;
    private ComboBoxModel<Alumne.Matricula.Modul> comboBoxModel;

    //Getters


    public ComboBoxModel<Alumne.Matricula.Modul> getComboBoxModel() {
        return comboBoxModel;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public DefaultTableModel getModelMat() {
        return modelMat;
    }

    public Model() {


        //Anem a definir l'estructura de la taula dels alumnes
        model=new DefaultTableModel(new Object[]{"Nom","Pes","És alumne?","Object"},0){
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
                //if(column==1) return true;
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




        //Anem a definir l'estructura de la taula de les matrícules
        modelMat=new DefaultTableModel(new Object[]{"MP","Nota"},0){
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
                //if(column==1) return true;
                return false;
            }

            //Permet definir el tipo de cada columna
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Alumne.Matricula.Modul.class;
                    case 1:
                        return Integer.class;
                    default:
                        return Object.class;
                }
            }
        };



        //Estructura del comboBox
        comboBoxModel=new DefaultComboBoxModel<>(Alumne.Matricula.Modul.values());



    }
}
