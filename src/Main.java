public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();



    }
    public static void printParameterYear (int year) {
        if ((year%4==0 || year%400==0) && year%100!=0) {
            System.out.println(year + " год яляется високосным");
        } else System.out.println(year + " год не является високосным.");

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int year = 2022;
        printParameterYear(year);
    }
    public static void getClient (String clientOs, int year) {
        int controlYear = 2015;
        if (year < controlYear && clientOs == "ios") {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }else if (year >= controlYear && clientOs == "ios") {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (year < controlYear && clientOs == "android") {
            System.out.println("Установите облегченную версию приложения для android по ссылке.");

        }else {
            System.out.println("Установите версию приложения для android по ссылке.");}
    }
    public static void task2 () {
        System.out.println("Задача 2");
        String clientOs = "android";
        int clientDeviceYear = 2016;
       getClient(clientOs, clientDeviceYear);

    }
    public static void printTieDeliveri (int kilometer){
        int deliveryTimeIsOneDay = 1;
        int deliveryTimeIsTwoDays = deliveryTimeIsOneDay + 1;
        int deliveryTimeIsThreeDays = deliveryTimeIsTwoDays + 1;
        if ( kilometer <= 20) {
            System.out.println("Потребуется дней: " + deliveryTimeIsOneDay);
        }else if (kilometer>20 && kilometer<=60) {
            System.out.println("Потребуется дней: " + deliveryTimeIsTwoDays);
        }else if (kilometer>60 && kilometer<=100) {
            System.out.println("Потребуется дней: " + deliveryTimeIsThreeDays);
        } else {
            System.out.println("К сожалению доставки нет.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 15;
        printTieDeliveri(deliveryDistance);


    }

}