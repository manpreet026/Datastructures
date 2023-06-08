//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/

//Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
//        Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.
//        Example 1:
//        Input: a = 2, b = 6, c = 5
//        Output: 3
//        Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)
public class minimumflips {
    public static int minFlips(int a, int b, int c) {
        int ans = 0;
        while (a != 0 | b != 0 | c != 0) {
            if ((c & 1) == 1) {
                if ((a & 1) == 0 && (b & 1) == 0) {
                    ans++;
                }
            } else {
                ans += (a & 1) + (b & 1);
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minFlips(2,3,5));
    }
}
