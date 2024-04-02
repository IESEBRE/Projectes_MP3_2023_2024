package org.example.app;

import org.example.controller.Controller;
import org.example.model.Model;
import org.example.view.Vista;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                //Definim la cultura de la nostra aplicació
                Locale.setDefault(new Locale("ca","ES"));
                try {
                    new Controller(new Model(), new Vista());

                }catch(LaMeuaExcepcio e){

                    JOptionPane.showMessageDialog(null, "Hem tingut un error!!");
                }


            }
        });
    }

}
