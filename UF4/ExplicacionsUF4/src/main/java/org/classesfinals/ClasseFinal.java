package org.classesfinals;

public final class ClasseFinal { //esta classe no podrà ser extesa
}


class Pare{

    public void metodeSobreescribible(){
        System.out.println("");
    }
    public final void metodeNoSobreescribible(){    //No es poden sobreescriure, però s'hereden com la resta
        System.out.println("");
    }

}

class Filla extends Pare{

    @Override
    public void metodeSobreescribible() {
        super.metodeSobreescribible();
    }
}