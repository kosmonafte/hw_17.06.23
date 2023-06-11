public class Task03 {
    public static void main(String[] args){
        float n = 123.621f;
        int wholePart, fractionPart;
        wholePart = (int)n;
        fractionPart = (int)((n - wholePart) * 10);
        System.out.println(n);
        if (fractionPart > 5) {
            System.out.println(wholePart + 1);
        } else {
            System.out.println(wholePart);
        }
    }
}
