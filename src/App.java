public class App {
    public static void main(String[] args) throws Exception {
        SemaforoVeicular A = new SemaforoVeicular("vermelho", "A");
        SemaforoVeicular B = new SemaforoVeicular("vermelho", "B");

        while (true) {
            A.esperar(3);
            A.mudarCor(); // verde
            B.status(); // vermelho
            A.esperar(3);
            A.mudarCor(); // amarelo
            B.status(); //vermelho
            A.esperar(3);
            A.mudarCor(); // vermelho
            B.status(); // vermelho
            B.mudarCor(); // verde
            A.status(); // vermelho
            B.esperar(3);   
            B.mudarCor(); // amarelo
            A.status(); // vermelho
            B.esperar(3);
            B.mudarCor(); // vermelho
            A.status(); // vermelho

        }
    }
    
}
