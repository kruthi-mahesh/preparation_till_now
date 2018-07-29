#include <iostream>
using namespace std;

class Person{
	int id;
public:
	Person(){
		cout<<"hereq";
	}
	Person(int i){
		cout<<"here34\n";
		id = i;
	}
	virtual void aboutMe(){
		cout<<"I am Person"<<endl;
	}
	virtual bool addCourse(string s) = 0;
	virtual ~Person(){
		cout<<"deleting Person"<<endl;
	}

};
class Stud: public Person{
public:


	virtual void aboutMe(){
		cout<<"i am student"<<endl;
	}
	
	
	bool addCourse(string s){
		cout<<"adding \n";
	}
	~Stud(){
		cout<<"deleting Stud"<<endl;
	}
};
int main(int argc, char const *argv[])
{
	//Person *p  = new Person();
	Person *s = new Stud();

	//p->aboutMe();
	s->aboutMe();
	//delete p;
	delete s;
	return 0;
}