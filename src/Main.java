import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);            // объявление переменной, что вводится с клавиатуры
        System.out.println("Введите количество дней наблюдения");        // текст введите число
        int N = in.nextInt();
        int[] massiv = new int[N]; // количество дней наблюдения задаем сколько данных в массиве
        System.out.println("Введите значения температуры");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = in.nextInt();  // заполнение массива консольным вводом
        }


        System.out.println("Максимальное количество дней = "+calcMaxDays(massiv));
    }

    public static int calcMaxDays(int massiv[]) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 1) {
                count = 0;
            } else count = count + 1;

            if (count > max) {
                max = count;

            }

        }


        return max;

    }


}




