package fitxers;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;

public class Aleatori {


    public static void main(String[] args) {
        File f = new File("nomirar.dat");
        //Intentem obrir el fitxer en mode escriptura "rw" per accedir-lo
        //aleatòriament. Usem un try-with-resources
        try (RandomAccessFile fitxer = new RandomAccessFile(f,"rw")) {
            //Ens situem a l'inici del fitxer
            fitxer.seek(0);
            //Escrivim el desplaçament on posarem l'enter
            fitxer.writeUTF("Hola");
            //Ens desplacem a la posició desitjada
            fitxer.seek("Hola".length()*Character.BYTES);


            //Escrivim l'enter secret
            fitxer.writeUTF("Bon dia");
            //Mostrem un missatge de comiat
            fitxer.seek(0);
            System.out.println(fitxer.readUTF());
            fitxer.seek("Hola".length()*Character.BYTES);
            System.out.println(fitxer.readUTF());
            System.out.println("Tot ha anat bé. Adéu!!");
        }catch(Exception e){
            //Si hi ha hagut alguna excepció mostrem un missatge
            System.out.println("No s'ha pogut escriure l'enter secret!!");
        }

    }
}
