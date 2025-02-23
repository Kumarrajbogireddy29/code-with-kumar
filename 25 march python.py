##a=open(r'C:\Users\CHANDANA\Desktop\filespy\example.txt','w')
##a.write('BY SUNDAY EVERYONE SHOULD COMPLETE THE CERTIFICATION COURSES')
##a.close()       
##       

f=open(r'C:\Users\CHANDANA\Desktop\filespy\example.txt','r')
##data=f.read()
data=f.readlines()
for i in data:
     print(i)
f.close()
