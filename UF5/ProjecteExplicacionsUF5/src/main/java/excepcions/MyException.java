package excepcions;

import javax.swing.*;
import java.io.FileNotFoundException;

public class MyException extends Exception{

    private MyEnumeration prop=MyEnumeration.U;

    public MyException (int valor) {

        for(MyEnumeration m: MyEnumeration.values())
            if(retornaNumero()==valor) this.prop=m;
        this.prop=MyEnumeration.U;
    }

    public String retornaMissatge() {
        return this.prop.getMisssatge();
    }

    public int retornaNumero() {
        return this.prop.getCodi();
    }

}
enum MyEnumeration{
    U(1,"Objecte no trobat"), DOS(2,"Format de dades incorrecte");

    private int codi;
    private String misssatge;

    MyEnumeration(int codi, String misssatge) {
        this.codi = codi;
        this.misssatge = misssatge;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getMisssatge() {
        return misssatge;
    }

    public void setMisssatge(String misssatge) {
        this.misssatge = misssatge;
    }
}

class Prova{

    public static void provocaExcepcio() throws FileNotFoundException {

            throw new FileNotFoundException();

    }



    public static void main(String[] args) {

        try {
            Prova.provocaExcepcio();
        } catch (FileNotFoundException e) {

            try {
                throw new MyException(1);
            } catch (MyException ex) {
                JOptionPane.showMessageDialog(null,ex.retornaMissatge());
            }
        }


    }



}
