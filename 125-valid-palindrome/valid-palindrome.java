class Solution {
    public boolean isPalindrome(String s) {
        

        // Remove all special characters and spaces, then convert to lowercase 
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //  now Reverse the  string
        String reversed = new StringBuilder(s).reverse().toString();

        // Compare original string with reversed string
        return s.equals(reversed);
    }
}
        
