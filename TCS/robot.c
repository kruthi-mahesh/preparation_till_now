#include<stdio.h>


int max_score(int n,
		int curr_stone_index,
		int multi_factor,
		int is_double_step_taken)
{
	if(curr_stone_index>=n)
		return 0;
	int score =0;
	/*if(curr_stone_index != -1)
	{
		score = multi_factor * stone_val[curr_stone_index];
	}
	// No Skipping
	// Moving to next stone*/
	int val1 = max_score(n,curr_stone_index+1,
			1,//multipli.factor
			is_double_step_taken);
	// Skipping once
	// multi factor = 2
	int val2 = max_score(n,curr_stone_index+2,
			2,//multi_factor
			is_double_step_taken);
	int val3 = 0;
	if(is_double_step_taken == 0)
	{
		val3 = max_score(n,curr_stone_index+3,
			3,//multi_factor
			1/*set_double_step_taken*/);
	}
	int total_score = val1 + val2 + val3;
	
	return total_score;
}
int main(int argc, char const *argv[])
{
	//int n=3;
	//int stone_val[] = {4,2,3};
	int n=3;
		printf("%d\n", max_score( n,
					-1, // Current step
					1, // Multi factor
					0 /* Double step taken */));
	return 0;
}
