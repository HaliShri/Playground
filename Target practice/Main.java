#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, tr, st=1, sum=0;
  std::cin>>n;
  std::cin>>tr;
  sum=tr;
  while(sum<n)
  {
    std::cin>>tr;
    sum+=tr;
    st++;
  }
  std::cout<<"The number of turns is "<<st;
}