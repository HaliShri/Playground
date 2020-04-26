#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,b;
  std::cin>>u;
  if(u<=200)
  {
    b=0.5*u;
    std::cout<<"Rs."<<b;
  }
  else if(u<=400)
  {
    b=(0.65*u+100);
    std::cout<<"Rs."<<b;
  }
  else if(u<=600)
  {
    b=(0.8*u+200);
    std::cout<<"Rs."<<b;
  }
  else
  {
    b=(u*1.25+425);
    std::cout<<"Rs."<<b;
  }
}