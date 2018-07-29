#include <iostream>
using namespace std;
template<class T> class ShiftedList{
	T* array;
	static int offset=0;
	int size;
public:
	ShiftedList(int sz) : size(sz){
		//offset = 10;
		array  =new T[size];
	}
};
int main(int argc, char const *argv[])
{
	//ShiftedList<int> sl = new ShiftedList<int>();//error
	ShiftedList<int> *sl = new ShiftedList<int>(6);
	return 0;
}