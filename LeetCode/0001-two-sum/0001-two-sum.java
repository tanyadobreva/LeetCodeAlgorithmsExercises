import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        int[] result = { 0, 0 };

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int diff = target - currentNumber;
            if (ht.containsKey(diff)) {
                result[0] = ht.get(diff);
                result[1] = i;
                return result;
            } else
                ht.put(currentNumber, i);
        }
        return null;
    }
}