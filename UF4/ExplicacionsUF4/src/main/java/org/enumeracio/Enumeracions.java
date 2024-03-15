package org.enumeracio;

public enum Enumeracions {


}

enum Direccio{
    NORD(1, true), SUD(2, true), EST(3, false), OEST(4, false);

    private int atribut;
    private boolean agrada;

    //Mètode constructor de l'enum
    private Direccio(int atribut, boolean agrada) {
        this.atribut = atribut;
        this.agrada=agrada;
    }

    public int getAtribut() {
        return atribut;
    }

    public void setAtribut(int atribut) {
        this.atribut = atribut;
    }

    public boolean isAgrada() {
        return agrada;
    }

    public void setAgrada(boolean agrada) {
        this.agrada = agrada;
    }

    @Override
    public String toString() {
        return "Direccio{" +
                "atribut=" + atribut +
                ", agrada=" + agrada +
                '}';
    }
}


class X{

    private Direccio direccio;

    public Direccio getDireccio() {
        return direccio;
    }

    public void setDireccio(Direccio direccio) {
        this.direccio = direccio;
    }

    public static void main(String[] args) {
        X obj=new X();

        obj.setDireccio(Direccio.NORD);
        System.out.println(obj.getDireccio());

        System.out.println(Direccio.NORD.getAtribut());
        System.out.println(Direccio.NORD.isAgrada());

        for(int i : new int[]{1,2,3}  ){
            System.out.println(i);

        }

        for(Direccio p:  Direccio.values()){
            System.out.println(p);

        }
        System.out.println();
        for (int i = 0; i < Direccio.values().length; i++) {

            System.out.println(Direccio.values()[i]);
        }


    }
}




