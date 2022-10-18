public class Main {
    public static void main(String[] args) {
	    int[] nums = {2,52,-5,-70,42,19,55,67,89};
	    int target = 42;
	    boolean ans = linearSearch(nums, target);
        System.out.println(ans);
    }
  
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
