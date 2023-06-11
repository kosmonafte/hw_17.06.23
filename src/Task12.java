public class Task12 {
    public static void main(String[] args) {
        int children = 123;
        int k, k1 = 100, k2 = 60, k3 = 1, milkBag = 0, pie;
        float milk = 0.9f, cup = 0.2f, milkSum, pieSum, tmpMilk, tmpPie;

        k = 45; // Выставляем нужный процент k1 = 100%, k2 = 60%, k3 = 1%, или ставим любой процент.
                // Пример k = k1 или k = 40;

        pieSum = (float)children + (float)children / 100 * k;
        pie = (int)pieSum;
        tmpPie = pieSum - (float)pie;
        if (tmpPie > 0) {
            pie += 1;
        }
        milkSum = (cup * children / 100 * k) / milk;
        milkBag = (int)milkSum;
        tmpMilk = milkSum - (float)milkBag;
        if (tmpMilk > 0) {
            milkBag += 1;
        }
        System.out.println("Если " + k + "% детей вес меньше 30 кг то требуется " + pie + " пирожков и " + milkBag + " пакетов молока." );
    }
}
