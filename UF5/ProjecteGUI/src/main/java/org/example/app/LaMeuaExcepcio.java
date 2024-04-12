package org.example.app;

public class LaMeuaExcepcio extends Exception{

    private int codi;
    private String missatge;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public LaMeuaExcepcio(int codi, String missatge) {
        this.codi = codi;
        this.missatge = missatge;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getMissatge() {
        return missatge;
    }

    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }
}
