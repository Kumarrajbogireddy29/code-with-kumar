r=9
n=r-1
for i in range(r-1):
    for j in range(n-i):
        print(" ",end="")
    temp = i*2+1
    for k in range(temp):
        print("*",end="")
    print()
for i in range(r-1,-1,-1):
    for j in range(n-i):
        print(" ",end="")
    for k in range(i*2+1):
        print("*",end="")
    print()