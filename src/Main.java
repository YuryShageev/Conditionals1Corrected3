public class Main {
    public static void main(String[] args) {
        // Задание 1. Блок 2
        System.out.println("Task 1. Block 3");
        int yearsOld = 16;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека " + yearsOld + " ему нужно ходить в садик");
        } else if (yearsOld>=7 && yearsOld<=18) {
            System.out.println("Если возраст человека " + yearsOld + " ему нужно ходить в школу");
        } else if (yearsOld>18 && yearsOld<24) {
            System.out.println("Если возраст человека " + yearsOld + " ему нужно ходить в университет");
        } else if (yearsOld>=24) {
            System.out.println("Если возраст человека " + yearsOld + " ему нужно ходить на работу");
        }
    }
}