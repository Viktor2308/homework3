package com.skypro.homework3;

public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();

    }
    public static void task1(){
        System.out.println("Task 1");
        /*
        Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более,
        должно соответствовать правилу camelCase.
        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        */
        int one = 23423;
        byte two = 43;
        short three = 765;
        long four = 765679L;
        float five = 579.89f;
        double six = 796.987;
        System.out.println("The value of a variable one of type int is " + one );
        System.out.println("The value of a variable two of type byte is " + two );
        System.out.println("The value of a variable three of type short is " + three );
        System.out.println("The value of a variable four of type long is " + four );
        System.out.println("The value of a variable five of type float is " + five );
        System.out.println("The value of a variable six of type double is " + six );
    }
    public static void task2(){
        System.out.println("Task 2");
        /*
        Ниже дан список различных значений. Инициализируйте переменные,
        используйте изученные ранее типы переменных.
        Значения:
        27.12
        987678965549
        2,786
        569
        -159
        27897
        67
         */
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        short s1 = -159;
        int i = 27897;
        byte b = 67;
    }
    public static void task3(){
        System.out.println("Task 3");
        /*
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате:
        «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.
         */
        int studentsLp = 23;
        int studentsAc = 27;
        int studentsEa = 30;
        int totalPaper = 480;
        int paperForStudent = totalPaper / (studentsAc+studentsEa+studentsLp);
        System.out.println("Designed for each student: " + paperForStudent + " sheets of paper.");
    }
    public static void task4(){
        System.out.println("Task 4");
        /*
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        Какая производительность машины будет:
        за 20 минут,
        в сутки,
        за 3 дня,
        за 1 месяц?
        Рассчитывайте продолжительность работы машины в том случае,
        если она работает без перерыва заданный промежуток времени.
        Результаты подсчетов выведите в консоль в формате:
        «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.
         */
        int mpTwoMin = 16; // machine performance in 2 min
        int mpOneMin = mpTwoMin/2; // machine performance in 1 min
        int mpTwentyMin = mpOneMin * 20; // machine performance in 20 min
        int mpOneDay = mpOneMin * 60 * 24; // machine performance in 24 hours
        int mpThreeDay = mpOneDay * 3; // machine performance in 3 days
        int mpOneMonth = mpOneDay * 31; // machine performance in 31 days
        System.out.println("In 1 minutes the machine produced " + mpOneMin + " bottles.");
        System.out.println("In 2 minutes the machine produced " + mpTwoMin + " bottles.");
        System.out.println("In 20 minutes the machine produced " + mpTwentyMin + " bottles.");
        System.out.println("In 24 hours the machine produced " + mpOneDay + " bottles.");
        System.out.println("In 3 days the machine produced " + mpThreeDay + " bottles.");
        System.out.println("In 1 month the machine produced " + mpOneMonth + " bottles.");
    }
    public static void task5() {
        System.out.println("Task 5");
        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате:
        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.
         */
        int allPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int allClasses = allPaint / oneClass;
        int allWhitePaint = whitePaint * allClasses;
        int allBrownPaint = brownPaint * allClasses;
        System.out.println("At school " + allClasses + " classes, needed " + allWhitePaint + " bottle of white paint and "
                + allBrownPaint + " bottle of brown paint.");
    }
    public static void task6() {
        System.out.println("Task 6");
        /*
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        Результат в граммах и килограммах напечатайте в консоль.
         */
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int breakfastGram = weightBanana * 5 + weightMilk * 2 + weightIceCream * 2 + weightEgg * 4;
        double breakfastKg = breakfastGram*0.001;
        System.out.println("Athlete breakfast: " + breakfastGram + " gram.");
        System.out.println("Athlete breakfast: " + breakfastKg + " kg.");
    }
    public static void task7() {
        System.out.println("Task 7");
        /*
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории,
        нужно сбросить 7 кг.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.
         */
        int totalLoseWeightKG = 7;
        int minLoseWeightDay = 250;
        int maxLoseWeightDay = 500;
        int minDayAll = totalLoseWeightKG*1000/ minLoseWeightDay;
        int maxDayAll = totalLoseWeightKG*1000/ maxLoseWeightDay;
        int averageDayAll = (minDayAll + maxDayAll)/2;
        System.out.println("Athlete needs to lose weight min " + minDayAll + " days.");
        System.out.println("Athlete needs to lose weight max " + maxDayAll + " days.");
        System.out.println("Athlete needs to lose weight an average " + averageDayAll + " days.");
    }
    public static void task8() {
        System.out.println("Task 8");
        /*
        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет
        для следующих сотрудников:
        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику. Например:
        «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
        */
        int mashaBaseSalary = 67760;
        int denisBaseSalary = 83690;
        int kristinaBaseSalary = 76230;
        int increaseSalary = 10;
        int mashaNewSalary = mashaBaseSalary + mashaBaseSalary*increaseSalary/100;
        int denisNewSalary = denisBaseSalary  + denisBaseSalary*increaseSalary/100;
        int kristinaNewSalary = kristinaBaseSalary + kristinaBaseSalary*increaseSalary/100;
        int mashaYearSalary = mashaBaseSalary * 12;
        int mashaNewYearSalary = mashaNewSalary * 12;
        int denisYearSalary = denisBaseSalary * 12;
        int denisNewYearSalary = denisNewSalary * 12;
        int kristinaYearSalary = kristinaBaseSalary * 12;
        int kristinaNewYearSalary = kristinaNewSalary * 12;
        System.out.println("Masha new salary " + mashaNewSalary + " rub. The salary for the year increased by " + (mashaNewYearSalary-mashaYearSalary) + " rub.");
        System.out.println("Denis new salary " + denisNewSalary + " rub. The salary for the year increased by " + (denisNewYearSalary-denisYearSalary) + " rub.");
        System.out.println("Kristina new salary " + kristinaNewSalary + " rub. The salary for the year increased by " + (kristinaNewYearSalary-kristinaYearSalary) + " rub.");

    }
}