a = int(input("Enter the first side of Triangle:"))
b = int(input("Enter the second side of Triangle:"))
c = int(input("Enter the third side of Triangle:"))
if a+b>c and b+c>a and c+a>b :
    print("The given triangle is valid triangle .")
else :
    print("The given triangle is not a valid triangle.")