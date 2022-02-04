class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        int[] result = new int[sum];
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[currentIndex] = nums[i + 1];
                currentIndex++;
            }
        }
        return result;
    }
}
