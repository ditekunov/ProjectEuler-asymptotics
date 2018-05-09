--ghc 7.10


basicAlgo :: Int -> Int
improvedAlgo :: Int -> Int

-- Basic algorithm with O(N) speed
basicAlgo til = 
    sum (filter(\x -> x `mod` 3 == 0 || x `mod` 5 == 0)[1..til]) - til

-- Improved algorithm with O(1) speed
improvedAlgo til = 
    ((3*((til-1) `div` 3)*(((til-1) `div` 3)+1)) `div` 2) + ((5*((til-1) `div` 5)*(((til-1) `div` 5)+1)) `div` 2) - ((15*((til-1) `div` 15)*(((til-1) `div` 15)+1)) `div` 2)
    


main = 
    print $ [basicAlgo(1000), improvedAlgo(1000)]
    
