class Solution(object):
    def findGCD(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def gcd(a,b):
            if b==0:
                return a
            else:
                return gcd(b,a%b)

        return gcd(max(nums),min(nums))

    