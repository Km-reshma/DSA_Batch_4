class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();   // to store the Result store 
        for (char c : s.toCharArray()) {          // Har character par loop

            if (c >= 'A' && c <= 'Z') {           //if uppercase is present      
                sb.append((char)(c + 32));         // ASCII me convert karke add karo

            } else {                               // Nahi to waise hi add karo
                sb.append(c);                      
            }
        }
        return sb.toString();                      // Final string return karo
    }
}