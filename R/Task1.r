#R version 3.3.2 

total_sum = 0
  
total_list <- 1:999
# Basic algo with O(n) speed
for (i in total_list) {
    if ((i %% 3 == 0) | (i %% 5 == 0)) {
        total_sum <- total_sum + i
    }
}

print(total_sum)


total_sum <- 0

i <- 0
# Improved algo with O(n/2)
while (i < 997) {
    i <- i + 3
    total_sum <- total_sum + i
}

i <- 0

while (i < 995) {
    i <- i + 5
    if (i %% 3 != 0) {
        total_sum <- total_sum + i
    }
}

print(total_sum)

# O(1) solution
print(((3*333*(333+1))/2) + ((5*199*(199+1))/2) - ((15*66*(66+1))/2))
