public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age <= 17) {
            System.out.println("Ты еще не совершеннолетний, подожди немного))");
        } else {
            System.out.println("Поздравляю,ты совершеннолетний!");
        }

        int tempOutside = 10;
        if (tempOutside <= 5) {
            System.out.println("На улице " + tempOutside + " градусов, надень шапку!");
        } else {
            System.out.println("На улице " + tempOutside + " градусов, можно без шапки!");
        }

        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int age1 = 27;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в садик");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }

        int kidsAge = 15;
        if (kidsAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidsAge + " то ему нельзя кататься на аттракционе");
        }
        if (kidsAge >= 5 && kidsAge <= 14) {
            System.out.println("Если возраст ребенка равен " + kidsAge + " то ему можно кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + kidsAge + " то ему можно кататься на аттракционе");
        }

        int carriage = 102;
        int seat = 60;
        int passenger = 75;
        if (passenger > seat && passenger < carriage) {
            System.out.println(" В вагоне нет сидячих мест");
        }
        if (passenger < seat && passenger < carriage) {
            System.out.println("В вагоне есть места");
        } else {
            System.out.println("Вагон полный");
        }

        int one = 50;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        }
        if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }
    }
}