import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n2 = nums2.length - 1;
        int n1 = nums1.length;

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = n2; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }

            if(stack.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], stack.peek());

            stack.push(nums2[i]);
        }

        int[] ans = new int[n1];

        for(int i = 0; i < n1; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}