#pragma once
#include "Survivor.h"

class Tribe {
private:
    char* name;
    int maxSurvivors;
    Survivor** survivors;
    int remainingSurvivors;

public:
    Tribe(const char* name, int maxSurvivors);
    ~Tribe();
    void setName(const char* name);
    void addSurvivor(Survivor* survivor);
    void eliminateSurvivor(const char* name);
    void printSurvivors();
};