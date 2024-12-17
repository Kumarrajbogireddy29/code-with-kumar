string=input("Enter the string:")
vowels="aeiouAEIOU"
count=0
for char in string:
    if char in vowels:
        count=count+1
print("The no of  vowels  is ",count)