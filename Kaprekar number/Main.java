#include<iostream>
#include<cmath>
int countDigit(int n)
{
	int c=0;
	while(n>0)
	{
		n/=10;
		c++;
	}
	return c;
}
int main()
{
	int k, s, t, ck, cs;
	std::cin>>k;
	s=k*k;
	ck=countDigit(k);
	cs=countDigit(s);
	int th=pow(10,ck);
	t=s%th;
	s/=th;
	t+=s;
	if(t==k)
		std::cout<<"Kaprekar Number";
	else
		std::cout<<"Not a Kaprekar Number";
}