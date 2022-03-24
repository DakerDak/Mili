public class Main {
    public static void main(String[] args) {

        int money = 700;   // стоимость билета
        int mile = 20; // количество рублей для одной бонусной милли
        int bonus = money / mile; // рассчитываем количество бонусных милль

        System.out.println("Колличество бонусных миль: " + bonus + " милей");


    }
}
