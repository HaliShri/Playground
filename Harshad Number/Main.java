#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, s=0;
  std::cin>>n;
  int t=n;
  while(t>0) {
    s+=t%10;
    t/=10;
  }
  if(n%s==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}