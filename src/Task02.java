public class Task02 {
    public static void main(String[] args){
        int n = 123, summ = 0;
        for (int i = 0; i < 3; i++) {
            summ += n % 10;
            n /= 10;
        }
        System.out.println(summ);
    }
}
