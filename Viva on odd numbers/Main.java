#include<iostream>
int main()
{
	signed int no;
  	int te=0;
	float sc=0.0f;
	while(te<3)
	{
		std::cin>>no;
		if(no>0)
		{
			if(no%2==1)
			{
				sc+=1.0f;
				te++;
			}
			else
				sc-=0.5f;
		}
		else
		{
			sc-=1.0f;
			break;
		}
	}
	std::cout<<sc;
}