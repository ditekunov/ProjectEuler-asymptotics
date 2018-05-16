# O(N)
square_sum <- 0
sum_of_squares <- 0
rng = 1:100

for (i in rng) {
    square_sum <- square_sum + i
    sum_of_squares <- sum_of_squares + i*i
}
    
square_sum <- square_sum * square_sum

print(square_sum - sum_of_squares)


# O(1)
sm <- 100 * (100+1)/ 2
squared <- (100 * (100 + 1) * (2 * 100 + 1)) / 6

result <- sm * sm - squared
 
print(result)
