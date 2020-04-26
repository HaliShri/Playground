#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  float p,d;
  std::cin>>m>>p>>d;
  float x=d/p;
  if(x<=m)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}