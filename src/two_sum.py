class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        num_map = {}

        for i, num in enumerate(nums):
            complement = target - num

            # If the complement exists in our map we found the pair
            if complement in num_map:
                return [num_map[complement], i]

            num_map[num] = i

        return []