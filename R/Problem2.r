#R version 3.3.2 

firstFibonacci <- 1

secondFibonacci <- 1

sum_of_even_fibonacci <- 0

helper <- 0

# O(n) solution
while (secondFibonacci <= 4000000) {
    helper <- firstFibonacci
    firstFibonacci <- secondFibonacci
    secondFibonacci <- firstFibonacci + helper

    if (secondFibonacci %% 2 == 0) {
        sum_of_even_fibonacci <- sum_of_even_fibonacci + secondFibonacci 
    }
}

print(sum_of_even_fibonacci)
