public class Task10 {
    public static void main(String[] args){
        final int height = 170, weight = 97;
        int ideal = weight - (height - 110);
        if (ideal > 0) {
            System.out.println("Необходимо скинуть " + ideal + " кг");
        } else if (ideal == 0) {
            System.out.println("Ваш вес идеальный");
        } else {
            System.out.println("Необходимо набрать " + -ideal + " кг");
        }
    }
}
