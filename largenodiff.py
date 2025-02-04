nums=[1,5,7,8]
n=len(nums)
ans = -1
for i in range(n):
 for j in range(i+1,n):
     if nums[i]<nums[j]:
      temp=nums[j]-nums[i]
      ans=max(ans, temp)
return ans
        