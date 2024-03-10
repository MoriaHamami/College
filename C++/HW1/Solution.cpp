//
//  Created by Maayan Krasno and Roie Danino on 7/24/17. 
//  Edit and fixed #1 by Keren Kalif
//  Edit and fixed #2 by Aviv Shukrun
//
#include <cstring>
#include <iostream>
using namespace std;

const int NUM_OF_TRIBES = 2;
const int LEN = 21;

enum eFamilyStatus { SINGLE, MARRIED, IN_A_RELATIONSHIP };
char* familyStatusStr[] = { "Single", "Married", "In a relationship" };

struct Survivor
{
	char			name[LEN];
	int				age;
	eFamilyStatus	familyStatus;
};

struct Tribe
{
	char		name[LEN];
	int			maxNumOfSurvivors;
	Survivor**	allSurvivors;
	int			numOfCurrentMembers;
};

void readSurvivor( Survivor& s );
void printSurvivor( const Survivor& s );
void printTribe( const Tribe& t );
void readTribe( Tribe& t );
void removeSurvivorFromTribe( const char* name, Tribe& t );
void addSurvivorToTribe( Tribe& t, Survivor& s );
void freeTribe( Tribe& t );

int main( int argc, const char * argv[] )
{
	Tribe allTribes[NUM_OF_TRIBES];

	for( auto& tribe : allTribes )
	{
		readTribe( tribe );
		cout << endl;
	}

	bool fContinue = true;
	int tribeIndex = 0;
	do
	{
		char answer;

		cout << "Enter new survivor to tribe #" << ( tribeIndex % 2 == 0 ? 1 : 2 ) << "? (y/n) ";
		cin >> answer;

		if( answer == 'y' || answer == 'Y' )
		{
			Survivor* s1 = new Survivor;
			readSurvivor( *s1 );
			addSurvivorToTribe( allTribes[tribeIndex % 2], *s1 );
			tribeIndex++;
		}
		else
		{
			fContinue = false;
		}

		cout << endl;
	} while( fContinue &&
		( allTribes[0].numOfCurrentMembers < allTribes[0].maxNumOfSurvivors ||
			allTribes[1].numOfCurrentMembers < allTribes[1].maxNumOfSurvivors ) );


	cout << "\nAll tribes:\n";
	for( int i = 0; i < NUM_OF_TRIBES; i++ )
	{
		cout << "Tribe #" << ( i + 1 ) << ": " << endl;
		printTribe( allTribes[i] );
	}

	removeSurvivorFromTribe( "gogo", allTribes[0] );
	removeSurvivorFromTribe( "momo", allTribes[1] );

	cout << "\nAfter removing:\n";
	for( int i = 0; i < NUM_OF_TRIBES; i++ )
	{
		cout << "Tribe #" << ( i + 1 ) << ": " << endl;
		printTribe( allTribes[i] );
	}

	cout << endl;

	freeTribe( allTribes[0] );
	freeTribe( allTribes[1] );

	system( "pause" );
}

void readSurvivor( Survivor& s )
{
	cout << "please enter name: ";
	cin >> s.name;

	cout << "please enter age: ";
	cin >> s.age;

	cout << "please enter your eFamilyStatus : 0)singele 1)married 2)in a relationship: ";
	int familyStatus;
	cin >> familyStatus;
	s.familyStatus = (eFamilyStatus)familyStatus;
}

void readTribe( Tribe& t )
{
	cout << "enter the name of the tribe: ";
	cin >> t.name;

	cout << "please enter the max amount of survivors in the tribe: ";
	cin >> t.maxNumOfSurvivors;

	t.allSurvivors = new Survivor*[t.maxNumOfSurvivors];
	t.numOfCurrentMembers = 0;
}

void addSurvivorToTribe( Tribe& t, Survivor& s )
{
	if( t.numOfCurrentMembers < t.maxNumOfSurvivors )
	{
		t.allSurvivors[t.numOfCurrentMembers++] = &s;
	}
}

void removeSurvivorFromTribe( const char* name, Tribe& t )
{
	for( int i = 0; i < t.numOfCurrentMembers; i++ )
	{
		if( t.allSurvivors[i] != nullptr && strcmp( t.allSurvivors[i]->name, name ) == 0 )
		{
			delete t.allSurvivors[i];
			t.allSurvivors[i] = t.allSurvivors[t.numOfCurrentMembers - 1];
			t.numOfCurrentMembers--;
		}
	}
}

void printTribe( const Tribe& t )
{
	for( int i = 0; i < t.numOfCurrentMembers; i++ )
		printSurvivor( *t.allSurvivors[i] );
}

void printSurvivor( const Survivor& s )
{
	cout << "name: " << s.name << " age: " << s.age
		<< " familyStatus:" << familyStatusStr[s.familyStatus] << endl;
}

void freeTribe( Tribe& t )
{
	for( int i = 0; i < t.numOfCurrentMembers; i++ )
		delete t.allSurvivors[i];

	delete[]t.allSurvivors;
}