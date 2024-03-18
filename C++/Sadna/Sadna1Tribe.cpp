#include <iostream>
#include <string>

#define NAME_LEN 20

using namespace std;


struct Survivor {
	char name[NAME_LEN];
	int age;
	enum Status status;
};

enum Status {
	Single, Relationship, Marry
};

void init_survivor(Survivor& survivor) {
	char status; 
	cout << "Please enter survivor name: " << endl;
	cin >> survivor.name;

	cout << "Please enter survivor age: " << endl;
	cin >> survivor.age;

	cout << "Please enter survivor status (s,r,m): " << endl;
	cin >> status;

	switch (status)
	{
	case 's':
		survivor.status = Single;
		break;
	case 'r':
		survivor.status = Relationship;
		break;
	case 'm':
		survivor.status = Marry;

	default:
		break;
	}
}


void print_survivor(const Survivor& survivor) {
	cout << "Survivor name: " << survivor.name << endl;
	cout << "Survivor age: " << survivor.age << endl;
	cout << "Survivor status: " << survivor.status << endl;
}

int main() {
	Survivor x;
	init_survivor(x);
	print_survivor(x);
	return 0;
}