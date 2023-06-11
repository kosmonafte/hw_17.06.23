public class Task05 {
    public static void main(String[] args) {
        final int R = 3;
        final double P = 3.1415926;
        double S, L;
        L = 2 * P * R;
        S = P * R * R;
        System.out.print("Площадь и длина окружности для круга с радиусом 3: ");
        System.out.println("длина " + (float)L + ", площадь " + (float)S);
    }
}
