package org.example.model;

import javax.swing.table.DefaultTableModel;

public class Model {

    private DefaultTableModel model;

    //Getters dels objectes del model


    public DefaultTableModel getModel() {
        return model;
    }

    public Model() {

        //Anem a definir l'estructura de la taula
        model=new DefaultTableModel(new Object[]{"Nom","Pes","És alumne?"},0){
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

        //Omplim la taula en dades del fitxer o inventades
        Fitxers.llegirDades(model);





    }

    public void escriureDadesFitxer(){
        Fitxers.escriureDades(model);
    }
}
