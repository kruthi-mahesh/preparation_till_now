#include <stdio.h>
int main(int argc, char const *argv[])
{
	long double a = 3.45;
	printf("%Lf %lu %lu %lu % lu %lu %lu\n",a,sizeof(a),sizeof(double), sizeof(float), sizeof(3.14l),sizeof(3.14f),sizeof(3.14));
	return 0;
}