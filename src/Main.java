import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isYearLeap(2025);
        checkApplicationVersion(1, 2025);
        int deliveryDistance = calculateDeliveryTime(100);
        System.out.println( deliveryDistance);
    }

    //Task-1
    public static void isYearLeap(int year) {
        if (year < 1584) {
            System.out.println(year + " год не является високосным.");
        } else if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void checkApplicationVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}