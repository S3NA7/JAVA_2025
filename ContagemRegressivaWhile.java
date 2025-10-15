public class ContagemRegressivaWhile {

    public static void main(String[] args) {
        
        System.out.println("Iniciando a contagem regressiva...");
        
        int i = 10;

        while (i >= 1) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }
            i--;
        }
        System.out.println("\nFogo!");
    }
}