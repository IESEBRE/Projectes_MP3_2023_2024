package org.interficies;

public interface Ampliacio extends Inicial {
    void fesAlgoMes();
}

interface Inicial{

    void fesAlgo();

}

class Implementacio implements Inicial{


    @Override
    public void fesAlgo() {

    }

}

class Implementacio2 implements Ampliacio{


    @Override
    public void fesAlgo() {

    }

    @Override
    public void fesAlgoMes() {

    }
}
