//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {

    public static boolean checkYear (int year){
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void checkOS (int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDay (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");
        int year = 2025;
        if (checkYear(year)) {
            System.out.println(year + " год - является високосным");
        }
        else {
            System.out.println(year + " год — не является високосным");
        }

        // Task 2
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;;
        checkOS(clientOS, clientDeviceYear);

        // Task 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int countDays = calculateDay(deliveryDistance);
        if (countDays > 0){
            System.out.println("Потребуется дней: " + countDays);
        }
        else {
            System.out.println("Доставки нет");
        }

    }
}