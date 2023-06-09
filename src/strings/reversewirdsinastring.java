package strings;

import java.util.Arrays;

public class reversewirdsinastring {
    public static void main(String[] args) {
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
        // Trim the input string to remove leading and trailing spaces
        String s="the sky is blue";
        String[] str = s.trim().split("\\s+");
        System.out.println(Arrays.toString(str));

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        System.out.println( out + str[0]);
    }
}
