#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int Fp,Fd,Fs,Sp,Sd,Ss,Ap,Ad,As, F,S,A;
  std::cin>>Fp>>Fd>>Fs>>Sp>>Sd>>Ss>>Ap>>Ad>>As;
  F=(Fp-(Fp*Fd/100))+Fs;
  S=(Sp-(Sp*Sd/100))+Ss;
  A=(Ap-(Ap*Ad/100))+As;
  std::cout<<"In Flipkart Rs."<<F<<"\nIn Snapdeal Rs."<<S<<"\nIn Amazon Rs."<<A<<"\n";
  if(F<A&&F<=S)
    std::cout<<"He will prefer Flipkart";
  else if(A<S)
    std::cout<<"He will prefer Amazon";
  else
    std::cout<<"He will prefer Snapdeal";
}