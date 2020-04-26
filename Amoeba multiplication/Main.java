#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i, j, n, s=0;
  std::cin>>n;
  i=0; j=1; int c;
  for(c=3;c<=n;c++){
    s=i+j;
    i=j; j=s;
  }
  std::cout<<s;
}