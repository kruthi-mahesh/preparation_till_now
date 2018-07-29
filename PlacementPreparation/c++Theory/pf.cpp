#include <iostream>
#include <iomanip>

using namespace std;
int main(int argc, char *argv[]) {
    double pi = 3.14159;
	
    // Let's say we wanted to scale this to 2 decimal places:
    cout << fixed << setprecision(2) << pi << endl;
    printf("%.2f", pi);
}
//which produces this output:
//3.14
//3.14