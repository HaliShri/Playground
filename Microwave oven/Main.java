#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float sh,th;
  std::cin>>n>>sh;
  if(n>3)
    std::cout<<"Number of items is more";
  else
  {
    switch(n)
    {
      case 1:
    	th=sh; break;
      case 2:
        th=1.5*sh; break;
      case 3:
        th=2*sh; break;
    }
    std::cout<<th;
  }
}