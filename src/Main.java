public class Main {
    public static void main(String[] args) {

        int firstFriday = 3;
        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0) {

                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println(" track 2 ");

        int distance = 42195;
        int interval = 500;
        do {
            System.out.println("Держитесь! Осталось " + (distance - interval) + " метров.");
            distance = distance - interval;
        } while (0 <= distance);

        int total = 42195;
        int distance2 = 500;
        for (; distance2 < total; distance2 += 500) {
            System.out.println(" Держитесь! Осталось " + (total - distance2) + " метров.");
        }


        System.out.println(" track 3 ");
        int maxBet = 700;
        int day = 0;
        while (maxBet >= 100 || (day + 1) % 5 == 0) {
            day++;

            if (day % 5 == 0) {
                continue;
            }

            maxBet -= 100;


        }
        System.out.println(" количество дней парковки " + day);


        int summa = 700;
        int time = 0;
        for (; summa >= 100; ) {
            if ((time + 1) % 5 == 0) {
                time++;
                continue;
            }
            summa -= 100;
            time++;

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
        while (charge < 100 && overheats < 3) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println(" зарядка прекратилась из-за трех перегревов или завершилась успешно " + minute + " минуты заняла зарядка");

    }
}


























