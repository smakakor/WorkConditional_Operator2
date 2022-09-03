public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        var clientOS = 1;
        var clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.printf("Приложение для IOS устанавливается");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Приложение для Android устанавливается");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        var year = 1204;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%d год является високосным", year);
        }else System.out.printf("%d год не является високосным", year);
    }
    public static void task4() {
        System.out.println("\nЗадание 4");
        var deliveryDistance = 5000;
        var days = 1;
        var km = 40;
        if (deliveryDistance >= 20) {
            days = (deliveryDistance / km) + days;
            System.out.printf("Потребуется дней: %d", days);
        } else {
            System.out.printf("Потребуется дней: 1");
        }
    }
        public static void task5() {
            System.out.println("\nЗадание 5");
            var monthNumber = 13;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.printf("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.printf("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.printf("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.printf("Осень");
                    break;
                default:
                    System.out.printf("Ошибка");
            }
    }
}