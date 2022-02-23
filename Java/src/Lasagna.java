public class Lasagna {
    static int expectedBakeTime = 40; // Expected baking time
    static int preparationTime = 2; // Expected preparation time

    // Returns expected minutes in oven
    public static int expectedMinutesInOven(){
        return  expectedBakeTime;
    }

    // Returns remaining minutes in the oven based on elapsed time
    public static int remainingMinutesInOven(int elapsed){
        return expectedMinutesInOven() - elapsed;
    }

    // Returns preparation time based on the amount of layers
    public static int preparationTimeInMinutes(int layers){
        return layers * preparationTime;
    }

    // Returns the total time the lasagna has been made
    public static int totalTimeInMinutes(int layers, int elapsed){
        return preparationTimeInMinutes(layers) + elapsed;
    }

    public static void main(String[] args) {
        //System.out.println(expectedMinutesInOven());
        System.out.println(totalTimeInMinutes(1,30));
    }
}
