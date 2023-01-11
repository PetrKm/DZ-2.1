public class Main {
    public static void main(String[] args) {

        long[] managers = new long[]{15, 10, 22, 25, 2, 44, 17}; // Массив с продажами продаж.
        SalesManager mng = new SalesManager(managers); //Вызов метода.
        System.out.println(mng.max()); // Вывод максимального значения продаж.

    }
}
