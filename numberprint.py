li=[5,1,8,1,6]
n=len(li)
ans=-1
for i in range(n):
    for j in range(i+1,n):
        if li[i]<li[j]:
            temp=li[j]-li[i]
            ans=max(ans,temp)
print(ans)