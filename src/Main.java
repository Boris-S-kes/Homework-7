public class Main {
    public static void main(String[] args) {

        int firstFriday = 3;
        for (;firstFriday<= 31;firstFriday++) {
            if (firstFriday % 7 == 0) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println(" track 2 ");

        int distance = 42195;
        int interval = 500;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров.");
            distance = distance - interval;
        } while (0 <= distance);

        int total = 42195;
        for (int i = 0; i <= 42195; i = i + 500) {
            int global = total - i;
            {
                System.out.println(" Держитесь! Осталось " + global + " метров.");
            }
        }

        System.out.println(" track 3 ");
        int maxBet = 300;
        int day = 0;
        while (maxBet >= 100) {
            day++;
            maxBet = maxBet - 100;
            if (day % 5 == 0) {
                continue;
            }
            System.out.println(" количество дней " + day);
        }
        int summa = 300;
        int time = 1;
        for (; summa >= 100; time++) {
            summa = summa - 100;
            if (time % 5 == 0) {
                continue;
            }
            System.out.println(" Количество дней парковки " + time);
        }
        System.out.println(" track 4");
        int month = 0;
        double total2 = 0;
        while (true) {
            total2 = total2 + 15000;
            month++;
            if (month % 6 == 0) {
                total2 = total2 * 1.07;
            }
            System.out.println("месяц " + month + " сумма " + total2);

            if (total2 >= 12000000) {
                System.out.println(month + " месяцев понадобится пользователю, чтобы накопить ");
                break;
            }
        }

        System.out.println(" Track 5 ");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (minute % 10 == 0) {
                overheats++;
                minute++;
                continue;
            }
            System.out.println(" Зарядка прекращена. Текущий заряд" + charge);
            if (overheats == 3) {
                break;
            }
        }
                System.out.println(" Время зарядки составило " + minute +" минут ");


            }
        }
























