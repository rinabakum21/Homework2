public class Main {
    public static void main(String[] args) {
        int moneyOnTheCard = 9000009;
        System.out.println(moneyOnTheCard);
        byte orangesWeight = 110;
        System.out.println(orangesWeight);
        short peopleInTheTown = 25000;
        System.out.println(peopleInTheTown);
        long linesOnPaper = 99995287663L;
        System.out.println(linesOnPaper);
        float myNumber = 18.562f;
        System.out.println(myNumber);
        double acidConcentration = 0.000578935;
        System.out.println(acidConcentration);


        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);


        byte pupilsLudmila = 23;
        byte pupilsAnna = 27;
        byte pupilsEkaterina = 30;
        short paperSheets = 480;
        float sheetsForOnePupil = (float) paperSheets / (pupilsEkaterina + pupilsAnna + pupilsLudmila);
        System.out.println("На каждого ученика рассчитано " + sheetsForOnePupil + " листов бумаги");


        byte inMinutes2 = 16;
        int inMinutes1 = inMinutes2 / 2;
        short inMinutes20 = (short) (inMinutes1 * 20);
        System.out.println("За 20 минут " + inMinutes20 + " бутылок");
        short inDay = (short) (inMinutes20 * 3 * 24);
        System.out.println("За сутки " + inDay + " бутылок");
        int inDay3 =  (inDay * 3);
        System.out.println("За 3 дня " + inDay3 + " бутылок");
        int inMonth = inDay3 * 10;
        System.out.println("За месяц " + inMonth + " буылок");



        byte whiteInOne = 2;
        byte brownInOne = 4;
        byte banks = 120;
        int inOneClass = whiteInOne + brownInOne;
        int numberOfClasses = banks / inOneClass;
        int whiteTotal = whiteInOne * numberOfClasses;
        int brownTotal = brownInOne * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");



        byte bananasWeight = 5 * 6;
        short milkWeight = 105 * 2;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int breakfast = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Вес завтрака составляет " + breakfast + " грамм");
        float breakfast2 = (float) breakfast / 1000;
        System.out.println("Вес завтрака составляет " + breakfast2 + " килограмма");


        short weightG = 7 * 1000;
        int day = weightG / 250;
        System.out.println("Уйдёт дней " + day + ", если будет терять по 250 грамм");
        int day2 = weightG / 500;
        System.out.println("Уйдёт дней " + day2 + ", если будет терять по 500 грамм");
        int daysOfAverage = (day + day2) / 2;
        System.out.println("Уйдет в среднем " + daysOfAverage + " день");


        float increase = 1.1f;
        int salaryMasha = 67760;
        float salaryMashaIncrease = salaryMasha * increase;
        float salaryDifference = salaryMashaIncrease - salaryMasha;
        System.out.println("Маша теперь получает " + salaryMashaIncrease + " рублей. Годовой доход вырос на " + salaryDifference + " рублей");
        int salaryDenis = 83690;
        float salaryDenisIncrease = salaryDenis * increase;
        float salaryDifference2 = salaryDenisIncrease - salaryDenis;
        System.out.println("Денис теперь получает " + salaryDenisIncrease + " рублей. Годовой доход вырос на " + salaryDifference2 + " рублей");
        int salaryCristina = 76230;
        float salaryCristinaIncrease = salaryCristina * increase;
        float salaryDifference3 = salaryCristinaIncrease - salaryCristina;
        System.out.println("Кристина теперь получает " + salaryCristinaIncrease + " рублей. Годовой доход вырос на " + salaryDifference3 + " рублей");

    }
}