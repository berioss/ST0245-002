
public class Recursion2 {

	public boolean groupSum5(int start, int[] nums, int target) {

		if (target == 0 && start == nums.length)
			return true;
		if (start == nums.length)
			return false;
		if (nums[start] % 5 == 0) {
			if (start + 1 != nums.length && nums[start + 1] == 1)
				nums[start + 1] = 0;
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		return groupSum5(start + 1, nums, target) || groupSum5(start + 1, nums, target - nums[start]);
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (target == 0)
			return true;
		if (start == nums.length)
			return false;
		int cont = nums[start];
		while (start + 1 != nums.length && nums[start] == nums[start + 1]) {
			cont = nums[start] + cont;
			start++;
		}

		return groupSumClump(start + 1, nums, target - cont) || groupSumClump(start + 1, nums, target);
	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (target == 0)
			return true;
		if (start >= nums.length)
			return false;
		return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
	}

	public boolean splitArray(int[] nums) {

		return auxiliar(nums, 0, 0);
	}

	public boolean auxiliar(int[] nums, int diferencia, int index) {
		if (index == nums.length && diferencia == 0)
			return true;
		if (index == nums.length)
			return false;
		return auxiliar(nums, diferencia - nums[index], index + 1)
				|| auxiliar(nums, diferencia + nums[index], index + 1);
	}

	public boolean splitOdd10(int[] nums) {
		return auxiliar(nums, 0, 0, 0);
	}

	public boolean auxiliar(int[] nums, int g1, int g2, int index) {
		if (index == nums.length && g1 % 10 == 0 && g2 % 2 == 1)
			return true;
		if (index == nums.length)
			return false;
		return auxiliar(nums, g1, g2 + nums[index], index + 1) 
			|| auxiliar(nums, g1 + nums[index], g2, index + 1);
	}

	public static void main(String args[]) {

	}
}
