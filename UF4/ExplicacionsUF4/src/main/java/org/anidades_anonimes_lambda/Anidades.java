package org.anidades_anonimes_lambda;

public class Anidades {   //Classe externa

    //Membres
    //propietats
    private int numero;

    //mètodes
    public void fesAlgo(){

    }

    //classes anidades
    //Estàtiques --> és com una classe normal però definida dins d'una altra classe
    public static class AnidadaEstatica{
        private int numero2;

        public AnidadaEstatica() {
        }

        public AnidadaEstatica(int numero2) {
            this.numero2 = numero2;
            //numero=25;      //NO podem accedir als membres de la classe externa

        }

        public int getNumero2() {
            return numero2;
        }

        public void setNumero2(int numero2) {
            this.numero2 = numero2;
        }
    }

    //Internes se'ls hi diu normalment (Inner)
    class Interna{

        private String nom;

        public Interna() {

            numero=25;      //SÍ podem accedir als membres de la classe externa
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    }



}

class Classe2{

    public static void main(String[] args) {
        //Objecte de la classe externa
        Anidades obj1=new Anidades();

        //Per instanciar objectes de la classe anidada estàtica ho fem com de costum
        Anidades.AnidadaEstatica obj2=new Anidades.AnidadaEstatica();

        //Per instanciar objectes de la classe anidada no estàtica (inner) necessitem un objecte de la classe externa
        Anidades.Interna obj3=obj1.new Interna();

        System.out.println(new Anidades().toString());
    }

}


