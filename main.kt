fun main() {
    println("Hello World")
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..nums.size - 1) {
            for (j in 0..nums.size - 1) {
                if (nums[i] + nums[j] == target)
                    return arrayOf(i, j).toIntArray()
            }
        }
        return intArrayOf()
    }
    fun main() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        println (twoSum(nums, target))
    }
}