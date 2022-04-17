import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if (!((birdsPerDay.length) == 0)){
            return birdsPerDay[birdsPerDay.length - 1];
        } else return 0;}

    public void incrementTodaysCount() {
        int element = birdsPerDay[birdsPerDay.length - 1];
        int elementIndex = getArrayIndex(birdsPerDay, element);
        int today = getToday() + 1;
        birdsPerDay[elementIndex] = today;
    }

    public boolean hasDayWithoutBirds() {
        return checkArrayForElement(birdsPerDay, 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        if (!(numberOfDays > birdsPerDay.length)){
            for (int i = 0; i < numberOfDays; i++) {
                sum += birdsPerDay[i];
                }
        } else {
            for (int j : birdsPerDay) {
                sum += j;
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int total = 0;

        for (int j : birdsPerDay) {
            if (j >= 5) {
                total += 1;
            }
        }
        return total;
    }

    public int getArrayIndex(int[] arr, int value) {

        int k = 0;
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == value){
                k = i;
                break;
            }
        }
        return k;
    }

    public boolean checkArrayForElement(int[] arr, int element) {

        for (int j : arr) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] day = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher birdCount = new BirdWatcher(day);

        System.out.println(Arrays.toString(birdCount.getLastWeek()));
        System.out.println("Old: " + birdCount.getToday());
        birdCount.incrementTodaysCount();
        System.out.println("New: " + birdCount.getToday());
        System.out.println("Array: " + Arrays.toString(birdCount.birdsPerDay));
        System.out.println("A day without birds: " + birdCount.hasDayWithoutBirds());
        System.out.println("Sum of first 4 days: " + birdCount.getCountForFirstDays(4));
        System.out.println("Total busy days: " + birdCount.getBusyDays());
    }
}
