
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){

        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            int leftIdx = i;
            int rightIdx = strArr.length - 1 - i;
            char leftPtr = strArr[leftIdx];
            char rightPtr = strArr[rightIdx];

            if (leftPtr != rightPtr) {
                return false;
            }
        }

        return true;
    }
}
