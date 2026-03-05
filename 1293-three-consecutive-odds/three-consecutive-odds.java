class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0; 

        for (int num : arr) {                // Loop through each number in array
            if (num % 2 != 0) {                // Check if the number is odd then increment the     consecituve odd count
                count++;

                if (count == 3) { 
                    return true; 
                }
            } else {
                count = 0;                    // Reset count if number is even
            }
        }

        return false; 
    }
}