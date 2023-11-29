/**
 * @author Igors Popmans
 * @version 1.0
 */


public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {

        String name = "     ПЕтРов Олег Иванович     ";
        String result = name.trim().toUpperCase();

        if (result.contains("ОВА")) {
            System.out.println("Уважаемая " + result);
        } else if (result.contains("ОВ")) {
            System.out.println("Уважаемый " + result);
        } else {
            System.out.println("Неизвестное лицо " + result);
        }
    }

    public static void ex2() {

        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                fuel >= 10
                        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {

        String someString = "this is simply. This is my favorite song.";

        String modifiedString = someString.replace("this is", "those are");

        int indexOfSecondChar = modifiedString.indexOf('o', modifiedString.indexOf('o') + 1);

        System.out.println("Индекс второй буквы 'o': " + indexOfSecondChar);
    }

    public static void ex4() {

        int kgSausage = 2000;
        int kgHam = 8511;
        int kgNeck = 6988;

        int costSausage = 800;
        int costHam = 350;
        int costNeck = 500;


        int costPriceSausage;
        if (kgSausage < 1000) {
            costPriceSausage = 412;
        } else if (kgSausage < 2000) {
            costPriceSausage = 408;
        } else {
            costPriceSausage = 404;
        }

        int costPriceHam = 275;

        int costPriceNeck;
        if (kgNeck < 500) {
            costPriceNeck = 311;
        } else {
            costPriceNeck = 299;
        }

        int income = kgSausage * costSausage + kgHam * costHam + kgNeck * costNeck;
        int expense = kgSausage * costPriceSausage + kgHam * costPriceHam + kgNeck * costPriceNeck + 1_000_000;
        int profitBeforeTax = income - expense;

        int tax;
        if (profitBeforeTax > 2_000_000) {
            tax = (int) (profitBeforeTax * 0.13);
        } else if (profitBeforeTax > 1_000_000) {
            tax = (int) (profitBeforeTax * 0.10);
        } else {
            tax = (int) (profitBeforeTax * 0.08);
        }
        int profitAfterTax = profitBeforeTax - tax;
        System.out.println("Прибыль после налогов: " + profitAfterTax);
    }
}
