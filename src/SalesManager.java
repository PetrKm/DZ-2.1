public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int cutAverage(int[] sales) {
        int cutAverage;
        int max = -1;
        int min = 1000;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (max < sales[i]){
                max = sales[i];
            }
            if (min > sales[i]){
                min = sales[i];
            }
        }
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        cutAverage = (sum - max - min)/(sales.length-2);
        return cutAverage;
    }
}