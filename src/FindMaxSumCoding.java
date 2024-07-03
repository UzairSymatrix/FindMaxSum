public class FindMaxSumCoding {
    public static int findMaxSum(String[] arr) {
        //Initialized variable name maxsum to keep track of the largest number found so far
        int maxSum = 0;
        //for each string i am initializing a variable currentsum  to keep track of the digits in the string
        for (String str : arr) {
            int currentSum = 0;
            //here i am converting the string to a character array using str.toCharArray and iterate through each character using another for loop.
            //For each character c, i check if it's a digit using Character.isDigit(c).
            //if 'c' is a digit i am getting its numeric value using Character.getNumericValue and add it to currentSum
           // After going through all characters in the string, we update maxSum with the maximum of maxSum and currentSum using Math.max(maxSum, currentSum)
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    currentSum += Character.getNumericValue(c);
                }
            }
            // After going through all characters in the string, i update maxSum with the maximum of maxSum and currentSum using Math.max(maxSum, currentSum).
            maxSum = Math.max(maxSum, currentSum);
        }
        //After going through all strings in the input array i return the final value of maxSum.
        return maxSum;
    }

    // In the main method, i used the example input array inputArray, call the findMaxSum method with inputArray, and print the result.
    public static void main(String[] args) {
        String[] inputArray = {"dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw"};
        int findmaximumSum = findMaxSum(inputArray);
        System.out.println(findmaximumSum); // Output: 13
    }
}
