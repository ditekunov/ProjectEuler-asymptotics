#include <iostream>

int main(int argc, const char * argv[]) {
    
    unsigned int start_time =  clock();
    
    float sm = 100 * (100+1)/ 2;
    float squared = (100 * (100 + 1) * (2 * 100 + 1)) / 6;
    
    std::cout << sm * sm - squared;
    
    
    unsigned int end_time = clock();
    unsigned int finish = end_time - start_time;
    
    std::cout << "Program took" << finish*0.001 << "seconds";
    
    return 0;
}
