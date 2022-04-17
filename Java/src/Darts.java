public class Darts {

    private final double x;
    private final double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double circle = Math.sqrt( x * x + y * y );

        if (circle > 5 && circle <= 10){
            return 1;
        } else if (circle > 1 && circle <= 5){
            return 5;
        } else if (circle >= 0 && circle <= 1){
            return 10;
        } else
            return 0;
    }
}
