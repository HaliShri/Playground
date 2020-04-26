#include<iostream>
int main()
{
	int b1,b2,b3,t;
	std::cin>>b1>>b2>>b3;
	if((b2<b1&&b1<b3)||(b3<b1&&b1<b2)) 
      	t=b1;
	else if((b1<b2&&b2<b3)||(b3<b2&&b2<b1))
		t=b2;
	else
      	t=b3;
		std::cout<<"The treasure is in box which has number "<<t<<"\n";
	int g=1, d=2;
	for(int i=0;i<t;i++) {
		if((b1%d==0)&&(b2%d==0)&&(b3%d==0)) {
			g*=d; b1/=d; b2/=d; b3/=d; }
		else
			d++;
	}
	std::cout<<"The code to open the box is "<<g;
}