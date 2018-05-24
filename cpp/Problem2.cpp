#include <stdio.h>
#include <cmath>
const double PHI = 1.6180339;
const double PSI = -0.61803398;

double Fib(double N) {
    double Fn = (pow(PHI, N) - pow(PSI, N)) / sqrt(5);
    
    return floor(Fn);
}

double nFib(double F)
{
    double nFib = log((double)F * sqrt(5) + 0.5) / log(PHI);
    
    return floor(nFib);
}

double bqIdentity25(double N)
{
    return (Fib(3*floor(N) + 2) - 1) / 2;
}


#include <iostream>

int main(int argc, const char * argv[]) {
    
    unsigned int start_time =  clock();
    
    unsigned int end_time = clock();
    unsigned int finish = end_time - start_time;
    
    double limit = 4000000;
    double nearestIndex = nFib(limit);
    double sum = bqIdentity25(nearestIndex / 3);
    
    std::cout << sum;
    std::cout << "Program took" << finish*0.001 << "seconds";
    
    return 0;
}
