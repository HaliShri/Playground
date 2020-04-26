#include<iostream>
int main()
{
	int total_balls, total_runs, runs_scored, balls_bowled;
	float total_overs, overs_finished, cur_run_rate, total_run_rate;
	std::cin>>total_balls>>total_runs>>runs_scored>>balls_bowled;
	total_overs=((total_balls/6)+(total_balls%6)*0.1);
	overs_finished=((balls_bowled/6)+(balls_bowled%6*0.1));
	cur_run_rate=runs_scored/overs_finished;
	total_run_rate=total_runs/total_overs;
	std::cout<<total_overs<<"\n";
  	std::cout.precision(1);
  	std::cout<<std::fixed<<overs_finished<<"\n"
      	<<cur_run_rate<<"\n"
      	<<total_run_rate<<"\n";
	if(cur_run_rate>total_run_rate)
		std::cout<<"Eligible to Win";
	else
		std::cout<<"Not Eligible to Win";
}