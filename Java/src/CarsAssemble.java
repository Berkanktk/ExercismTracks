/*
In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. The assembly line's speed can range from 0 (off) to 10 (maximum).

At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced, which then have to be discarded. The following table shows how speed influences the success rate:

1 to 4: 100% success rate.
5 to 8: 90% success rate.
9: 80% success rate.
10: 77% success rate.
 */


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
