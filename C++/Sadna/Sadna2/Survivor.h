#pragma once
enum Status {
	Single, 
	Relationship, 
	Marry
};

class Survivor {
private:
	char* name;
	unsigned int age;
	Status status;

public:
	Survivor(const char* name, const unsigned int age, char status);

	void SetAge(const unsigned int age);
	void SetName(const char* name);
	void SetStatus(const char status);

	unsigned int GetAge();
	char* GetName();
	const char* GetStatus();

	void print();

	~Survivor();
};
