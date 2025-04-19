#include<stdio.h>
int palin(int);
int main()
{
	int n;
	scanf("%d",&n);
	int pali=palin(n);
	printf("%d",pali);
}
int palin(int n)
{
	int pali=0,r;
	while(n!=0)
{
	r=n%10;
    pali=pali*10+r;
    n=n/10;
}
    return pali;
}
