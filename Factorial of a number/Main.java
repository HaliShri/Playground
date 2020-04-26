#include<iostream>
int main(){
  // Type your code here
  int no, fact=1;
  std::cin>>no;
  for(int i=1;i<=no;i++)
    fact*=i;
  std::cout<<fact;
}