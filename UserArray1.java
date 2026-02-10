public class UserArray1 {

    public static int findTotal(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static double findAverage(int[] arr) {
        int total = findTotal(arr);
        return (double) total / arr.length;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));
        System.out.println("Total: " + findTotal(arr));
        System.out.println("Average: " + findAverage(arr));
    }
}
