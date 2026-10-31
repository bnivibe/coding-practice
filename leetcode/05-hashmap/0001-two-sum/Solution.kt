class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            map[num] = index
        }
        nums.forEachIndexed { index, num ->
            map[target - num]?.let{
                if(index == it){return@forEachIndexed}
                return intArrayOf(index, it) 
            }
        }
        return intArrayOf()
    }
}