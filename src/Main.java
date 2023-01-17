public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        while (i > 0) {
            i--;
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int nation = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int increase = (nation / 1000) * 17;
            int decrease = (nation / 1000) * 8;
            int sub = increase - decrease;
            nation += sub;
            System.out.println("Год " + i + ", численность населения составляет " + nation);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double rsl = 15000;
        for (int i = 1; rsl <= 12_000_000; i++) {
            rsl += (rsl / 100 * 7);
            System.out.println(i + " месяц " + rsl + " сумма накопления.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double rsl = 15000;
        for (int i = 1; rsl <= 12_000_000; i++) {
            rsl += (rsl / 100 * 7);
            if (i % 6 == 0) {
                System.out.println(i + " месяц " + rsl + " сумма накопления.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double rsl = 15000;
        int time = 12 * 9;
        for (int i = 1; i < time; i++) {
            rsl += (rsl / 100 * 7);
            if (i % 6 == 0) {
                System.out.println(i + " месяц " + rsl + " сумма накопления.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int month = 31;
        for (int i = friday; i <= month; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int comet = 79;
        int first = 2023 - 200;
        int last = 2023 + 100;
        for (int i = 0; i <= last; i += comet) {
            if (i >= first) {
                System.out.println(i);
            }
        }
    }
}
