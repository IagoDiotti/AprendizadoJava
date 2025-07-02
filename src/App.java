public class App {
    public static void main(String[] args) throws Exception {
        SemaforoVeicular semaforo = new SemaforoVeicular("vermelho");
        System.out.println("Cor inicial: " + semaforo.getCor());
        semaforo.mudarCor();
        System.out.println("Cor atual:" + semaforo.getCor());
        semaforo.mudarCor();
        System.out.println("Cor atual: " + semaforo.getCor());
    }
    
}
