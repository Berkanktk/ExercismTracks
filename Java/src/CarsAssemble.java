public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed >= 5 && speed <= 8) {
            return speed * (221 * 0.90);
        } else if (speed == 9) {
            return speed * (221 * 0.8);
        } else if (speed == 10) {
            return CarsAssemble.round(speed * (221 * 0.77),1);
        } else {
            return speed * 221;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double wPerMinute = productionRatePerHour(speed);
        return (int) (wPerMinute / 60);
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();

        System.out.println(carsAssemble.productionRatePerHour(10)); // Outputs: 1701.7
        System.out.println(carsAssemble.workingItemsPerMinute(6)); // Outputs: 19
    }
}
