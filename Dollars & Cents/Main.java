#include<iostream>
int main()
{
	int d1, c1, d2, c2, ds, cs;
	std::cin>>d1>>c1>>d2>>c2;
	cs=c1+c2;
	if(cs>=100)
	{
		cs-=100;
		ds=1;
	}
	ds+=d1+d2;
	std::cout<<ds<<"\n"<<cs;
}