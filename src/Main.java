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
    public static void getClient (int clientOs, int year) {
        int controlYear = 2015;
        if (year < controlYear && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }else if (year >= controlYear && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (year < controlYear && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для android по ссылке.");

        }else {
            System.out.println("Установите версию приложения для android по ссылке.");}
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2016;
       getClient(clientOs, clientDeviceYear);

    }
    public static void printTieDeliveri (int kilometer){
        int deliveryTime = 1;
        if ( kilometer <= 20) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }else if (kilometer>20 && kilometer<=60) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }else if (kilometer>60 && kilometer<=100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней: " + deliveryTime
            );
        } else {
            System.out.println("К сожалению доставки нет.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 61;
        printTieDeliveri(deliveryDistance);


    }

}