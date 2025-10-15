public class ConversorTemperatura {

    public static void main(String[] args) {
        double celsius = 30.0; 
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.printf("%.1f graus Celsius equivalem a %.1f graus Fahrenheit.\n", celsius, fahrenheit);
    }
}