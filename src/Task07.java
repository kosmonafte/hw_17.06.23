public class Task07 {
    public static void main(String[] args){
        final int PROCENT = 7;
        int depo = 50000, years = 2;
        System.out.println("Тело вклада на начало срока: " + depo);
        for (int i = 0; i < years; i++) {
            depo += depo*PROCENT/100;
            System.out.println("Вклад после " + (i+1) + " года: " + depo);
        }
        System.out.println("Вклад на конец срока: " + depo);
    }
}
