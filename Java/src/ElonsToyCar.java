public class ElonsToyCar {
    private int driven = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + driven + " meters";
    }

    public String batteryDisplay() {
        if (!(battery == 0)){
            return "Battery at " + battery + "%";
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (!(battery == 0)){
            driven += 20;
            battery -= 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar toyCar = ElonsToyCar.buy();
        toyCar.drive();
        toyCar.drive();
        System.out.println(toyCar.distanceDisplay()); // Outputs = Driven 40 meters
        System.out.println(toyCar.batteryDisplay());  // Outputs = Battery at 98%
    }
}
