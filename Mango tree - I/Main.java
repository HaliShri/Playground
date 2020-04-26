#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  std::cin>>r>>c>>n;
  if((n<c)||(n%c==0)||(n%c==1))
	  std::cout<<"Yes";
  else
	  std::cout<<"No";
}