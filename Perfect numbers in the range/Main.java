#include <iostream>
int main()
{
	int r1, r2, c, sum=0;
	std::cin>>r1>>r2;
	c=r1;
	while(c<=r2)
	{
		for(int i=2;i<c;i++)
		{
			if(c%i==0)
				sum+=i;
		}
		if(c==sum)
			std::cout<<c<<" ";
		c++;
      	sum=1;
	}
}