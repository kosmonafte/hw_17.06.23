public class Task11 {
    public static void main(String[] args) {
        int time = 543876, days, hours, minutes, seconds, tmp;
        seconds = time % 60;
        time /= 60;
        minutes = time % 60;
        time /= 60;
        hours = time % 24;
        time /= 24;
        System.out.println(time + " Дней, " + hours + " Часов, " + minutes + " Минут, " + seconds + " Секунды. ");
    }
}
