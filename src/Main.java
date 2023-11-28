/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ex1();

    }


    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        String result = name.trim().toUpperCase();


        if (name.contains("ОВА")) {
            System.out.println("Уважаемая " + result);
        } else if (name.contains("ОВ")) {
            System.out.println("Уважаемый " + result);
        } else {
            System.out.println("Неизвестное лицо " + result);
        }
    }
}