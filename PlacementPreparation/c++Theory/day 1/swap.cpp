#include <iostream>     // std::cout
//#include <algorithm>    // std::swap
#include <vector>       // std::vector

using namespace std;
int main () {

  int x=10, y=20;                              // x:10 y:20
  swap(x,y);                              // x:20 y:10
  cout << x << " "<< y<<endl;
  vector<int> foo (4,x), bar (6,y);       // foo:4x20 bar:6x10
  swap(foo,bar);                          // foo:6x10 bar:4x20

  cout << "foo contains:";
  vector<int>::iterator it;
  for ( it=foo.begin(); it!=foo.end(); ++it)
    cout << ' ' << *it;
  cout << '\n';

  return 0;
}

//o/p: 20 10 /n foo contains: 10 10 10 10 10 10
