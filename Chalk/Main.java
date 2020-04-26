#include<iostream>
#include<cmath>
int main()
{
	int c, d, temp;
	std::cin>>c;
	temp=pow(c,0.5f);
	d=c+temp+1;
	std::cout<<d;
}
