def solution(nums):
    hash = {}
    for n in nums:
        if n in hash:
            hash[n] += 1
        else:
            hash[n] = 1
        
    if len(nums)/2  <= len(hash): 
        return len(nums)/2 
    return len(hash)