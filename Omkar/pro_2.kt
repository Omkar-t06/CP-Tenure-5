// Brute Force
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var index = 0;
        for(num in nums) {
            if(num != 0){
                nums[index] = num
                index++
            }
        } 
        for(i in index until nums.size)
            nums[i] = 0
    }
}

// Optimal approach
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var j = nums.indexOfFirst {it -> it == 0}
        if(j == -1) return;

        for(i in j until nums.size) {
            if(nums[i] != 0) {
                nums[j] = nums[i]
                nums[i] = 0
                j++
            }
        }
    }
}