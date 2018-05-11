-- Basic O(n^2) solution
factorization :: Int -> [Int]
factorization til = (filter(\x -> til `mod` x == 0 && isPrime x)[1..til])

isPrime :: Int -> Bool
isPrime til = null (filter(\x -> til `mod` x == 0)[2..til-1])

main = print $ (maximum (factorization 600851475143))
