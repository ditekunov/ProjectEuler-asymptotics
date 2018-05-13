-- Basic O(n^2) solution
factorization :: Int -> [Int]
factorization til = (filter(\x -> til `mod` x == 0 && isPrime x)[1..til])

isPrime :: Int -> Bool
isPrime til = null (filter(\x -> til `mod` x == 0)[2..til-1])

-- Improved O(n*log(log(n))) solution
primesTo m = eratos [2..m] where
   eratos (p : xs) 
      | p*p > m   = p : xs
      | otherwise = p : eratos (xs `minus` [p*p, p*p+p..m])
                                  
 
minus a@(x:xs) b@(y:ys) = case compare x y of
         LT -> x : minus  xs b
         EQ ->     minus  xs ys
         GT ->     minus  a  ys
minus a        b        = a 



main = print $ (maximum (factorization 600851475143))
