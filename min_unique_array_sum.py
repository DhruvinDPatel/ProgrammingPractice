def  getMinimumUniqueSum(arr):
    arr.sort()
    n = len(arr)
    count = 0
    
    for i in range(n):
        for j in range(i+1,n):
            if arr[i] == arr[j]:
                arr[j] = arr[j] + 1
                
    for val in arr:
        count += val
    return count

    def twoSum(nums, target):
            lookup = {}
            for i, num in enumerate(nums):
                if target - num in lookup:
                    return (lookup[target - num] + 1, i + 1)
                lookup[num] = i