class Solution {
    public int removeElement(int[] nums, int val) {
        int elements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;

            nums[elements] = nums[i];
            elements++;
        }
        return elements;
    }
}