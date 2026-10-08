class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
        n = len(nums)
        pos = []
        neg = []

        # Separate both negative and positive array if present
        for num in nums:
            if num < 0:
                neg.append(num)
            else:
                pos.append(num)

        # Case 1: No negative numbers

        if len(neg) == 0:
            return [x * x for x in pos]

        # Case 2: No positive number:
        if len(pos) == 0:
            res = [x * x for x in neg][::-1]
            # res.serverse() could also be done
            return res

        # Case 3: Both neg and pos exist
        neg = [x * x for x in neg][::-1]
        pos = [x * x for x in pos]
        n, m = len(neg), len(pos)
        res = []

        i = j = 0
        while i < n and j < m:
            if neg[i] <= pos[j]:
                res.append(neg[i])
                i += 1
            else:
                res.append(pos[j])
                j += 1

        while i < n:
            res.append(neg[i])
            i += 1

        while j < m:
            res.append(pos[j])
            j += 1

        return res