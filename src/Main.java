import java.time.LocalDate;

public class Main {
    // exercise 1
    public static void isTheYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - является высокосным");
        } else {
            System.out.println(year + " - не является высокосным");
        }
    }
// exercise 2
    public static void clientAppVersion(int OS, int deviceYear) {
        if (OS == 0 && deviceYear == LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0 && deviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1 && deviceYear == LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && deviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    // exercise 3
    public static void deliveryTime(int a) {
        if (a <= 20) {
            System.out.println("Время доставки 1 день");
        } else if (a > 20 && a <= 60) {
            System.out.println("Время доставки 2 дня");
        } else if (a > 60 && a <= 100) {
            System.out.println("Время доставки 3 дня");
        } else {
            System.out.println("Доставка в ваш район невозможна");
        }
    }


    public static void main(String[] args) {
        // exercise 1
        int year = 2022;
        isTheYearLeap(year);

        // exercise 2
        int OS = 0;
        int deviceYear = 2021;
        clientAppVersion(OS, deviceYear);

        // exercise 1
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);

    }
}