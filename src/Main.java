import java.util.Random;
public class Main {    public static void main(String[] args) {
    int[] array = new int[200];
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(201);
    }
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    // Вычисляем количество чисел по разрядам
    for (int i = 0; i < array.length; i++) {
    int numDigits = String.valueOf(array[i]).length();
    if (numDigits == 1) {
        count1++;            } else if (numDigits == 2) {
        count2++;            } else if (numDigits == 3) {
        count3++;            }
}
          for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");        }
        System.out.println();
                // Вычисляем процентное отношение чисел по разрядам
    double percent1 = (double) count1 / array.length * 100;
                double percent2 = (double) count2 / array.length * 100;
                double percent3 = (double) count3 / array.length * 100;
                // Выводим результаты на экран
                System.out.println("Количество одноразрядных чисел: " + count1);
                System.out.println("Количество двухразрядных чисел: " + count2);
                System.out.println("Количество трехразрядных чисел: " + count3);
                System.out.println("Процент одноразрядных чисел: " + percent1 + "%");
                System.out.println("Процент двухразрядных чисел: " + percent2 + "%");
                System.out.println("Процент трехразрядных чисел: " + percent3 + "%");
                }
}