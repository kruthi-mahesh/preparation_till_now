#include <iostream>
using namespace std;

class Person{
	int id;
public:
	virtual void aboutMe(){
		cout<<"I am Person"<<endl;
	}
	virtual ~Person(){
		cout<<"deleting Person"<<endl;
	}

};
class Stud: public Person{
public:
	void aboutMe(){
		cout<<"i am student"<<endl;
	}
	~Stud(){
		cout<<"deleting Stud"<<endl;
	}
};
int main(int argc, char const *argv[])
{
	Person *p  = new Person();
	Person *s = new Stud();

	p->aboutMe();
	s->aboutMe();
	delete p;
	delete s;
	return 0;
}