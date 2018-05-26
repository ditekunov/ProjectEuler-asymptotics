#R version 3.3.2 
  
p_a <- 0
p_b <- 0 
p_c <- 0

rng <- 1:998

# O(n^3)
for (a in rng) {
    for (b in a+1:998) {
        for (c in b+1:998) {
            if (a*a + b*b == c*c & a+b+c == 1000) {
                p_a <- a
                p_b <- b
                p_c <- c 
                break
            }
        }
    }
}

print(p_a * p_b * p_c)
