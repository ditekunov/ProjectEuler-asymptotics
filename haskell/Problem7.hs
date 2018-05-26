--ghc 7.10

-- O(n*log(log(n))) solution
primesTo m = eratos [2..m] where
   eratos (p : xs) 
      | p*p > m   = p : xs
      | otherwise = p : eratos (xs `minus` [p*p, p*p+p..m])
                                  
 
minus a@(x:xs) b@(y:ys) = case compare x y of
         LT -> x : minus  xs b
         EQ ->     minus  xs ys
         GT ->     minus  a  ys
minus a        b        = a 

main = print $ ((primesTo 150000)!!10001)
