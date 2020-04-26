#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,x;
  std::cin>>m>>n>>x;
  if((x>m)&&(x<=(2*m)))
    std::cout<<"It is a mango tree";
  else if((x>(3*m))&&(x<=(4*m)))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}