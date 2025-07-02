public class SemaforoVeicular extends Semaforo {
    public SemaforoVeicular(String cor) {
        super (cor);
    }

    @Override
    public void mudarCor() {
        switch (this.cor) {
            case "vermelho":
                this.cor = "verde";
                break;
            case "verde":
                this.cor = "amarelo";
                break;
            case "amarelo":
                this.cor = "vermelho";
                break;
        }
    }
}