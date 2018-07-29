#include<stdio.h>


int max_score(int n,
		int curr_index,
		int multi_factor)
{
	if(curr_index ==  0 || curr_index == 1)
		return curr_index;
	int score =0;
	/*if(curr_stone_index != -1)
	{
		score = multi_factor * stone_val[curr_stone_index];
	}
	// No Skipping
	// Moving to next stone*/
	int val1 = max_score(n,curr_index-1,
			1//multipli.factor
			);
	// Skipping once
	// multi factor = 2
	int val2 = max_score(n,curr_index-2,
			2//multi_factor
			);
	
	int total_score = val1 + val2 ;
	
	return total_score;
}
int main(int argc, char const *argv[])
{
	//int n=3;
	//int stone_val[] = {4,2,3};
	int n=4;
		printf("%d\n", max_score( n,
					n+1, // Current step
					1 // Multi factor
					/* Double step taken */));
	return 0;
}
