#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x=3,y=4,a,b,c,d;
  std::cin>>a>>b;
  (a>x)?(c=a-x):(c=x-a);
  (b>y)?(d=b-y):(d=y-b);
  (c>d)?(std::cout<<c):(std::cout<<d);
}