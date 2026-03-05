class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;                              // Count negative numbers

        for (int num : nums) {                            // Loop through each number
            if (num == 0) {
                return 0;                                  // If any number is zero, product is zero
            } else if (num < 0) {
                negativeCount++; 
            }                      

        }


        // If number of negatives is odd → product negative (-1)
        // If number of negatives is even → product positive (1)
        return (negativeCount % 2 == 0) ? 1 : -1;
    }

    }
