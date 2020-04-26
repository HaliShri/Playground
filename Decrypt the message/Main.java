#include<iostream>
int main()
{
	int e, t, s, c, sum=1;
  	std::cin>>e>>t;
  	s=e+t;
  	c=s;
  	for(int i=2;i<c;i++)
    {
      if(c%i==0)
      { 
		sum+=i;
      	
      }
    }
  if(s==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
  	
}