class Solution {
    public int removeDuplicates(int[] nums) {
      int un = 1;
      for(int i=1; i<nums.length; i++){
        if(nums[i] != nums[i-1]){

        un += 1;
        nums[un -1] = nums[i];

        }
      }  
      return un;

    }
}