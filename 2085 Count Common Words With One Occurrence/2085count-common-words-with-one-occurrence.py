class Solution(object):
    def countWords(self, words1, words2):
        """
        :type words1: List[str]
        :type words2: List[str]
        :rtype: int
        """
        count=0
        for i in words1:
            if words2.count(i)==1 and words1.count(i)==1:
                count+=1
        return count