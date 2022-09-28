public class Main {
    public static void main(String[] args) {
        // Задание 1. Блок 3
        System.out.println("Task 1. Block 3");
        int yearsOld = 3;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека " + yearsOld + ", ему нужно ходить в садик");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека " + yearsOld + ", ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld < 24) {
            System.out.println("Если возраст человека " + yearsOld + ", ему нужно ходить в университет");
        } else if (yearsOld >= 24) {
            System.out.println("Если возраст человека " + yearsOld + ", ему нужно ходить на работу");
        }

        //Задание 2. Блок 3
        System.out.println("Task 2. Block 3");
        if (yearsOld < 5) {
            System.out.println("Ребёнку нельзя кататься на аттракционе");
        } else if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Ребёнку можно кататься на аттракционе в сопровождении родителя");
        } else {
            System.out.println("Человеку можно кататься на аттракционе самостоятельно");
        }

        //Задание 3. Блок 3
        System.out.println("Task 3. Block 3");
        int one = 111;
        int two = 111;
        int three = 111;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three>one){
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }
}