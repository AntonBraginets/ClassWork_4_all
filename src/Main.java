import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_4_1();
        Task_4_2();
        Task_4_3();
        Task_4_4();
        Task_4_5();
        Task_4_6();
        Task_4_7();
        Task_4_8();
    }

    private static void Task_4_1() {
        System.out.println("Задание 4.1");
        int N = new Random().nextInt(10);
        if (N == 0)
            N += 1;
        if (N == 1)
            System.out.print("В городе " + N + " банк. Курс валют следующий:\n");
        else if (N >= 2 & N <= 4)
            System.out.print("В городе " + N + " банкa. Курс валют следующий:\n");
        else
            System.out.print("В городе " + N + " банков. Курс валют следующий:\n");
        System.out.println();
        int bank_array[] = new int[N];
        for (int i = 0; i < bank_array.length; i++) {
            bank_array[i] = new Random().nextInt(3) + 26;
            System.out.println("Банк №" + (i + 1) + ". Курс в текущем банке " + bank_array[i] + ".");
        }
        int max_element = bank_array[0];
        int best_bank = 0;
        for (int i = 0; i < bank_array.length; i++) {
            if (max_element < bank_array[i]) {
                max_element = bank_array[i];
                best_bank = i;
            }
        }
        System.out.println("\nИдите в банк №" + (best_bank + 1) + ". Там курс: " + max_element + " грн/долл.");
    }

    private static void Task_4_2() {
        System.out.println();
        System.out.println("Задание 4.2");
        System.out.print("Введите значение длины массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int element = 1;
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            //new Random().nextInt(100); //создание объекта по слабой ссылке
        }
        for (int i = 1; i < array.length; i *= 2) {
            System.out.println(i + " " + array[i]);
        }
    }

    private static void Task_4_3() {
        System.out.println();
        System.out.println("Задание 4.3");
        int N = new Random().nextInt(10);
        if (N < 3)
            N += 3;
        int array[] = new int[N];
        int sum = 0;
        System.out.println("Число элементов массива: " + N);
        System.out.println();
        for (int i = 2; i < array.length; i += 2) {
            array[i] = new Random().nextInt(100);
            sum += array[i];
            System.out.println("№ элемента массива: " + i + ", значение: " + array[i]);
        }
        System.out.println("\nСумма четных элеменов массива равно: " + sum);
    }

    private static void Task_4_4() {
        System.out.println();
        System.out.println("Задание 4.4");
        int n = new Random().nextInt(10);
        int array[] = new int[n];
        int multipl = 1;
        int count = 0;
        System.out.println("Общее число элементов нашего массива: " + n);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            if (array[i] % 9 == 0 & array[i] != 0) {
                count += 1;
                multipl *= array[i];
                System.out.println("Элемент №" + (i + 1) + ", со значением: " + array[i] + " кратный 9");
            }
        }
        if (count < 1)
            multipl = 0;
        System.out.println();
        System.out.println("Элементы к колчестве " + count + " шт. кратны 9.");
        System.out.println("Их произведение равно: " + multipl);
    }

    private static void Task_4_5() {
        System.out.println();
        System.out.println("Задание 4.5");
        int A = new Random().nextInt(500);
        int dist = 0;
        int array[] = new int[30];
        System.out.println("Улитка стартовала с отметки " + A + " см.");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(2);
            if (array[i] == 0)
                dist += 2;
            else dist -= 1;
            if (dist + A >= 500) {
                System.out.println("Она доползла до верха палки на " + (i + 1) + " день своего путешествия.");
                break;
            } else if (dist + A <= 0) {
                System.out.println("На " + (i + 1) + " день путешествия она оказалась на земле.");
                break;
            }
        }
        if (dist > 0)
            System.out.println("Улитка проползла вверх " + dist + " см. и находится на отметке " + (dist + A) + " см.");
        else if (dist < 0)
            System.out.println("Улитка проползла вниз " + (-1 * dist) + " см. и находится на отметке " + (dist + A) + " см.");
        else System.out.println("Улитка осталась на месте.");
    }

    private static void Task_4_6() {
        System.out.println();
        System.out.println("Задание 4.6");
        int n = new Random().nextInt(23) + 1;//случайное кол-во месяцев, max 24;
        int array_income[] = new int[n];
        int array_spend[] = new int[n];
        int array_profit[] = new int[n];
        int sum = 0;
        int max = array_profit[0];
        int min = array_profit[0];
        int count_positive = 0;
        int count_negative = 0;
        int month_max = 0;
        int month_min = 0;
        int count_profit = 0;
        int count_loss = 0;
        for (int i = 0; i < array_income.length; i++) {
            array_income[i] = new Random().nextInt();//присвоение случайной суммы дозодов
            if (array_income[i] <= 0)
                i -= 1;
        }
        for (int j = 0; j < array_spend.length; j++) {
            array_spend[j] = new Random().nextInt();//присвоение случайной суммы расходов;
            if (array_income[j] <= 0)
                j -= 1;
        }
        for (int k = 0; k < array_profit.length; k++) {
            array_profit[k] = array_income[k] - array_spend[k];
            if (max < array_profit[k]) {
                max = array_profit[k];
                month_max = k;
            }
            if (min > array_profit[k]) {
                min = array_profit[k];
                month_min = k;
            }
            if (array_profit[k] >= 0) {
                count_profit += 1;
                System.out.println("Сумма прибыли за " + (k + 1) + " месяц составляет: " + array_profit[k]);
            } else {
                count_loss += 1;
                System.out.println("Сумма убытка за " + (k + 1) + " месяц составляет: " + array_profit[k]);
            }
            sum += array_profit[k];
        }
        if (sum > 0)
            System.out.println("\nОбщая прибыль за " + n + " мес. равна " + sum);
        else
            System.out.println("\nОбщий убыток за " + n + " мес. равен " + sum);
        if (max > 0) {
            System.out.println("Максимальная прибыль была получена в " + (month_max + 1) + " месяце и составила " + max);
            System.out.println("Количество прибыльных месяцев " + count_profit);
        } else
            System.out.println("Не было прибыльных месяцев.");
        if (min < 0) {
            System.out.println("Максимальный убыток был получен в " + (month_min + 1) + " месяце и составил " + min);
            System.out.println("Количество убыточных месяцев " + count_loss);
        } else
            System.out.println("Не было убыточных месяцев.");
    }

    private static void Task_4_7() {
        System.out.println();
        System.out.println("Задание 4.7");
        int h = new Random().nextInt(10);
        if (h <= 6) ;
        h += 6;//нужно 3 лучших и 3 худших рез. -> делаем минимум 6 результатов в массиве
        int d = new Random().nextInt(10);
        if (d <= 6) ;
        d += 6;//нужно 3 лучших и 3 худших рез. -> делаем минимум 6 результатов в массиве
        int array_H[] = new int[h];
        int array_D[] = new int[d];
        boolean flag_h = true;
        boolean flag_d = true;
        int temp = 0;
        for (int i = 0; i < array_H.length; i++) {
            array_H[i] = new Random().nextInt(200);
            //if (array_H[i] < 0) - получается, что это не надо? если задаем bound возвращаются значения от 0?
            //  i -= 1;
        }
        System.out.println(" ");
        for (int j = 0; j < array_D.length; j++) {
            array_D[j] = new Random().nextInt(300);
            //if (array_D[j] < 0)
            //  j -= 1;
        }
        while (flag_h) {
            flag_h = false;
            for (int i = 0; i < array_H.length - 1; i++) {
                if (array_H[i] < array_H[i + 1]) {
                    temp = array_H[i];
                    array_H[i] = array_H[i + 1];
                    array_H[i + 1] = temp;
                    flag_h = true;
                }
            }
        }
        while (flag_d) {
            flag_d = false;
            for (int i = 0; i < array_D.length - 1; i++) {
                if (array_D[i] < array_D[i + 1]) {
                    temp = array_D[i];
                    array_D[i] = array_D[i + 1];
                    array_D[i + 1] = temp;
                    flag_d = true;
                }
            }
        }
        System.out.println("Лучшие результаты в дисциплине ПРЫЖКИ В ДЛИНУ:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "-е место: " + array_D[i] + " см");
        }
        System.out.println("Худшие результаты в дисциплине ПРЫЖКИ В ДЛИНУ:");
        for (int i = array_D.length - 3; i < array_D.length; i++) {
            System.out.println((i + 1) + "-е место: " + array_D[i] + " см");
        }
        System.out.println();
        System.out.println("Лучшие результаты в дисциплине ПРЫЖКИ В ВЫСОТУ:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "-е место: " + array_H[i] + " см");
        }
        System.out.println("Худшие результаты в дисциплине ПРЫЖКИ В ВЫСОТУ:");
        for (int i = array_H.length - 3; i < array_H.length; i++) {
            System.out.println((i + 1) + "-е место: " + array_H[i] + " см");
        }
    }

    private static void Task_4_8() {
        System.out.println();
        System.out.println("Задание 4.8");
        int a = new Random().nextInt(10);
        if (a == 0)
            a += 1;
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Количество элементов: \t\t" + array.length);
        System.out.println("Массив до перестановки: \t" + Arrays.toString(array));
        if (a == 1)
            System.out.println("\nПерестановка невозможна - массив состоит из одного элемента.");
        else {
            for (int i = 0; i < array.length / 2; i++) {
                array[i] += array[array.length - 1 - i];
                array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
                array[i] -= array[array.length - 1 - i];
            }
            System.out.println("Массив после перестановки: \t" + Arrays.toString(array));
        }
    }
}