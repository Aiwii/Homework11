public class Main {
    public static void main(String[] args) {
        isYearLeap(1580);
        checkApplicationVersion(0, 2024);
        calculateDeliveryTime(90);

    }

    //Task-1
    public static void isYearLeap(int year) {
        if (year < 0) {
            System.out.println("Год не может быть отрицательным.");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void checkApplicationVersion(int clientOS, int clientDeviceYear) {
        int targetYear = 2015;

        if (clientOS == 1 && clientDeviceYear >= targetYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= targetYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки по адресу нет.");
        }
    }
}
