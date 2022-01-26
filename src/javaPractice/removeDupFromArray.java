package javaPractice;

public class removeDupFromArray {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
		int[] expectedNums = {0,0,1,1,1,2,2,3,3,4}; // The expected answer with correct length

		int k = removeDuplicates(nums); // Calls your implementation
  		System.out.println("k="+k+"\nnums="+nums);
		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
	}
	
	
	public static int removeDuplicates(int[] nums) {
		int k=0;
		for (int i=1; i< nums.length; i++) {
			if (nums[i]!=nums[k]) {
				k++;
				nums[k]=nums[i];
			}
		}
		return k+1;
	}
}
