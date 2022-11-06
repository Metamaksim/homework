public class Main {
    public static void main (String[] args) {
        // write your code here
        byte z = 100;
        short x = 10000;
        int v = 100000000;
        long n = 1000000000000000L;
        float m = 1.56F;
        double l = 1.56234;
        System.out.println(x);
        System.out.println(z);
        System.out.println(n);
        System.out.println(m);
        System.out.println(v);
        System.out.println(l);


        float oneBoxerWeight = 78.2F;
        float twoBoxerWeight = 82.7F;
        float totalBoxersWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalBoxersWeight + "кг");
        float differenceBoxersWeight = (twoBoxerWeight - oneBoxerWeight);
        System.out.println("Разница мужду бойцами " + differenceBoxersWeight + "кг");

        short banan = 80;
        short milk = 105;
        short plombir = 100 ;
        short egg = 70;
        int coctailGr = (banan * 5) + (milk * 2) + (plombir * 2) + (egg * 4);
        System.out.println("Вес коктеля "+ coctailGr + " грамм");

        float coctailKg = coctailGr / 1000F;
        System.out.println("Вес коктеля " + coctailKg + " киллограмм");

        short fromWeight = 250;
        short toWeight = 500;
        short LeftWeight = 7 * 1000;

        int minimumDays = LeftWeight / toWeight;
        int maximumDays = LeftWeight / fromWeight;
        int middleDays = (minimumDays + maximumDays) / 2;
        System.out.println("Быстрое похудение за " + minimumDays + " дней");
        System.out.println("Медленное похудение за " + maximumDays + " дней");
        System.out.println("Похудение в среднем за " + middleDays + " день");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float mashaSalaryUp =  mashaSalary + mashaSalary / 100F * 10;
        float denisSalaryUp = denisSalary + denisSalary / 100F * 10;
        float kristinaSalaryUp = kristinaSalary + kristinaSalary / 100F * 10;
        float mashaSalaryUpYear = (mashaSalaryUp * 12) - (mashaSalary * 12);
        float denisSalaryUpYear = (denisSalaryUp * 12) - (denisSalary * 12);
        float kristinaSalaryUpYear = (kristinaSalaryUp * 12) - (kristinaSalary * 12);

        System.out.println ("Маша теперь получет " + mashaSalaryUpYear + " рублей. Годовой доход вырос на " + mashaSalaryUpYear + " рублей.");
        System.out.println ("Денис теперь получет " + denisSalaryUp + " рублей. Годовой доход вырос на " + denisSalaryUpYear + " рублей.");
        System.out.println ("Кристина теперь получет " + kristinaSalaryUp + " рублей. Годовой доход вырос на " + kristinaSalaryUpYear + " рублей.");


    }
}