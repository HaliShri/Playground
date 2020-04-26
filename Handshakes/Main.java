#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int p, h=0;
  std::cin>>p;
  for(int i=p-1;i>0;i--)
    h+=i;
  std::cout<<h;
}