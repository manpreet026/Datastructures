import java.util.Arrays;
//Can Make Arithmetic Progression From Sequence
//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
//Input: arr = [3,5,1]
//Output: true
//Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
public class arthimetic {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if (arr.length <= 2) {
            return true;
        } else {


            if (arr[1] - arr[0] != arr[2] - arr[1]) {
                return false;
            } else {
                int diff = arr[1] - arr[0];
                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i + 1] - arr[i] != diff) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr={4,3,2};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}