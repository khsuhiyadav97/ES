class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        remember = {}

        for i in range(len(nums)):
            needed = target - nums[i]

            if needed in remember:
                return [remember[needed], i]

            remember[nums[i]] = i