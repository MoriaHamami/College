

class Integer
{
private:
	int value;

public:
	Integer(int value);
	Integer operator+(int value);
	Integer operator-(int value);
	Integer operator/(int value);
	Integer operator*(int value);
	Integer operator+(Integer &value);
	Integer operator-(Integer &value);
	Integer operator/(Integer &value);
	Integer operator*(Integer &value);

	bool operator!=(Integer &other);
	bool operator==(Integer &other);
	bool operator>=(Integer &other);
	bool operator<=(Integer &other);
	bool operator>(Integer &other);
	bool operator<(Integer &other);

	Integer operator++();	  // ++y
	Integer operator++(int); // y++

	void setValue(int value);
	int getValue();
};
