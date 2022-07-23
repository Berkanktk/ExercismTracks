class NeedForSpeed {
    private int batteryDrain = 0;
    private int speed = 5;
    private int distanceDriven = 0;
    private int remainingBattery = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return remainingBattery == 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!(remainingBattery == 0)){
            distanceDriven += speed;
            remainingBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance = 800;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }
}