#include <iostream>

int main(int argc, const char * argv[]) {
    
    unsigned int start_time =  clock();
    
    unsigned int end_time = clock();
    unsigned int finish = end_time - start_time;
    
    std::cout << ((3*333*(333+1))/2) + ((5*199*(199+1))/2) - ((15*66*(66+1))/2);
    std::cout << "Program took" << finish*0.001 << "seconds";
    
    return 0;
}
