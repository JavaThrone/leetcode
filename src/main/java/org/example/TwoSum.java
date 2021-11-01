package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] x = twoSum(new int [] {2,1,2,6,7}, 4);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int part = target - nums[i];
            if (map.containsKey(part)) {
                return new int[] {map.get(part), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
