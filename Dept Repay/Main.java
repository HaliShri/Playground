#include<iostream>
using namespace std;
int main()
{
  int x, y, r, i, t;
  float d, f;
  cin>>x>>r>>y;
  i=x*r*y/100;
  t=x+i;
  d=i*0.02;
  f=t-d;
  cout<<i<<"\n";
  cout<<t<<"\n";
  cout<<d<<"\n";
  cout<<f;
}