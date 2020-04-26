#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c;
  std::cin>>w>>a>>c;
  int t=a*75+c*30;
  if(t>w)
    std::cout<<"Boat will drow";
  else if(t<w)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat is stable";
}