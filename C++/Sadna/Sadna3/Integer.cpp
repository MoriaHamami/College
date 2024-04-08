#include "Integer.h"

Integer::Integer(int value)
{
	setValue(value);
}

int Integer::getValue()
{
	return this->value;
}

void Integer::setValue(int value)
{
	this->value = value;
}

// obj = obj + obj
Integer Integer::operator+(Integer &value)
{
	return Integer(this->getValue() + value.getValue());
}

// obj = obj + int
Integer Integer::operator+(int value)
{
	return Integer(this->getValue() + value);
}

// obj = int + obj - Notice! Global func
Integer operator+(int val1, Integer val2)
{
	return Integer(val1 + val2.getValue());
}

Integer Integer::operator-(Integer &value)
{
	return Integer(this->getValue() - value.getValue());
}

Integer Integer::operator-(int value)
{
	return Integer(this->getValue() - value);
}

Integer Integer::operator/(Integer &value)
{
	return Integer(this->getValue() / value.getValue());
}

Integer Integer::operator/(int value)
{
	return Integer(this->getValue() / value);
}

Integer Integer::operator*(Integer &value)
{
	return Integer(this->getValue() * value.getValue());
}

Integer Integer::operator*(int value)
{
	return Integer(this->getValue() * value);
}

bool Integer::operator!=(Integer &other)
{
	return this->getValue() != other.getValue();
}

bool Integer::operator==(Integer &other)
{
	return !(*this != other);
}

bool Integer::operator>=(Integer &other)
{
	return this->getValue() >= other.getValue();
}

bool Integer::operator<=(Integer &other)
{
	return this->getValue() <= other.getValue();
}

bool Integer::operator>(Integer &other)
{
	return this->getValue() > other.getValue();
}

bool Integer::operator<(Integer &other)
{
	return this->getValue() < other.getValue();
}

Integer Integer::operator++()
{
	this->value++;
	return *this;
}

Integer Integer::operator++(int)
{
	// MINE:
	// int temp = this->getValue();
	// this->setValue(this->getValue()+1);
	// return temp;
	
	// TEACHER:
	Integer temp = Integer(this->value);
	this->value++;
	return temp;
}
