package org.solutions;

/**
 * Instructions
 *
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 *
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 *
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 *
 *
 * Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 */
public class ReverseWords {

    /**
     1. Splice the sentence (based on 1+ number of spaces). Assumption: returns an array.
     Note: do this with a regular expression
     2. Iterate the array backwards in a loop:
     2.a Add each word in the array to a new string
     2.b If we're not at the last word left in the array, also add a space.

     */
    public String reverseWords(String s) {
        final String[] splitStr = s.trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = splitStr.length - 1; i >= 0; i--) {
            builder.append(splitStr[i]);
            if (i != 0) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
