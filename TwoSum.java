package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution found");
	}

	public static void main(String[] args) {

		TwoSum ts = new TwoSum();

		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = ts.twoSum(nums, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);

	}

}


//PROBLEM
/*
 1. Two Sum
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
/*Here's an explanation of the solution:

1. We create a HashMap map to store the numbers we've seen so far and their indices.
2. We iterate through the nums array. For each number, we calculate its complement (the number that would add up to the target).
3. We check if the complement is already in the map. If it is, we've found a solution, and we return the indices of the two numbers.
4. If the complement is not in the map, we add the current number and its index to the map.
5. If we reach the end of the iteration without finding a solution, we throw an exception.

This solution has a time complexity of O(n) and a space complexity of O(n), where n is the length of the nums array.*/
