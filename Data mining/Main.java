#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rn, tp,es=0,os=0;
  std::cin>>rn;
  while(rn>0)
  {
    tp=rn%10;
    rn/=10;
    if(tp%2==0)
      es+=tp;
    else
      os+=tp;
  }
  if(es==os)
    std::cout<<"Yes";
  else 
    std::cout<<"No";
}