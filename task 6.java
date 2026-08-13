class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []

        for i in range(n):
            result.append(nums[i])
            result.append(nums[i + n])

        return result
Input
nums =
[2,5,1,3,4,7]
n =
3
Output
[2,3,5,4,1,7]
Expected
[2,3,5,4,1,7]
