#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b, c, a;
  std::cin>>b>>c;
  if(b>c)
    a=(100-b)+c;
  else
    a=c-b;
  std::cout<<a;
    
}