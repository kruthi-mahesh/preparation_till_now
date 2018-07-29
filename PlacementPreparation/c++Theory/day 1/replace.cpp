// replace algorithm example
#include <iostream>     // cout
#include <algorithm>    // replace
#include <vector>       // vector
using namespace std;
int main () {
  int myints[] = { 10, 20, 30, 30, 20, 10, 10, 20 };
  vector<int> myvector (myints, myints+8);            // 10 20 30 30 20 10 10 20

  replace (myvector.begin(), myvector.end(), 20, 99); // 10 99 30 30 99 10 10 99

  cout << "myvector contains:";
  for (vector<int>::iterator it=myvector.begin(); it!=myvector.end(); ++it)
    cout << ' ' << *it;
  cout << '\n';

  return 0;
}