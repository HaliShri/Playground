#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c,s;
  std::cin>>c>>s;
  if((2*c)<=s)
    std::cout<<"circle can be inside a square";
  else 
    std::cout<<"circle cannot be inside a square";
}