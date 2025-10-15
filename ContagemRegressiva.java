public class ContagemRegressiva {

    public static void main(String[] args) {
        
        System.out.println("Iniciando a contagem regressiva...");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nFogo!");
    }
}