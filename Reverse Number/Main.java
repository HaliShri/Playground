#include <iostream>
int main() 
{
	// Type your code here
  int n, dig;
  std::cin>>n;
  while(n!=0)
  {
    dig=n%10;
    n/=10;
    std::cout<<dig;
  }
	return 0;
}