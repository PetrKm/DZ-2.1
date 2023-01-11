public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long cutAverage(long[] sales) {
        long cutAverage;
        long max = -1;
        long min = 1000;
        long sum = 0;
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