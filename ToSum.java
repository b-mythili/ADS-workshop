public class ToSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 11, 15};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The indices of the  numbers that sum up to " + target + " are " + i + " and " + j);
                    System.out.println("The two numbers are " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}