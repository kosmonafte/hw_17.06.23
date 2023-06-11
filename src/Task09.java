public class Task09 {
    public static void main(String[] args) {
        float a = 3.13f, b = 2.5f, c = 5.0f, d = 10.0f, y;
        int x;
        x = (int)b;
        y = b - (float)x;
        if (y > 0) {
            System.out.println("Число " + b + " имеет вещественную часть");
        } else {
            System.out.println("Число " + b + " не имеет вещественную часть");
        }
    }
}
