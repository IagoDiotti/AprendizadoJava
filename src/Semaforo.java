public abstract class Semaforo {
    protected String cor;

    public Semaforo(String cor) {
        this.cor = cor;
    }

    public abstract void mudarCor();

    public String getCor() {
        return this.cor;
    }
}