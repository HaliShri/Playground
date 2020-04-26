#include<iostream>
#include<string>
int main()
{
  std::string door;
  int rail;
  std::cin>>door>>rail;
  if(door=="front") {
	if(rail==1)
		std::cout<<"Left Handed";
	else
		std::cout<<"Right Handed";
	}
  else {
	if(rail==1)
		std::cout<<"Right Handed";
	else
		std::cout<<"Left Handed";
	}
}