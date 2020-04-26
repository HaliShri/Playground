#include<iostream>
int main()
{
	int age;
	float show;
	std::cin>>age>>show;
	if(age>13)
	{
		if(show==13.30f)
			std::cout<<"$5.00";
		else
			std::cout<<"$8.00";
	}
	else
	{
		if(show==13.30f)
			std::cout<<"$2.00";
		else
			std::cout<<"$4.00";
	}
	}