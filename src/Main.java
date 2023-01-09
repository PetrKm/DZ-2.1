public class Main {
    public static void main(String[] args) {

        int[] managers = new int[]{15, 10, 22, 25}; // Массив с продажами продаж.
        SalesManager mng = new SalesManager(managers); //Вызов метода.
        System.out.println(mng.max()); // Вывод максимального значения продаж.

    }
}
