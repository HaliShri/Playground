#include<iostream>
int main()
{
	int sun, mon, tue, wed, thu, fri, sat, sum, sal;
	std::cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
	sum=sun+mon+tue+wed+thu+fri+sat;
	sal=sum*100;
	//more than 8 hours
	if(sun>8)
		sal+=(sun-8)*15;
	if(mon>8)
		sal+=(mon-8)*15;
	if(tue>8)
		sal+=(tue-8)*15;
	if(wed>8)
		sal+=(wed-8)*15;
	if(thu>8)
		sal+=(thu-8)*15;
	if(fri>8)
		sal+=(fri-8)*15;
	if(sat>8)
		sal+=(sat-8)*15;
	//more than 40 hrs in a week
	//if(sum>40)
	//	sal+=(sum-40)*25;
	//saturday bonus
	sal+=sat*25;
	//sunday bonus
	sal+=sun*50;
	std::cout<<sal;
}