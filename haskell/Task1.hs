basicAlgo :: Int -> Int

basicAlgo til = 
    sum (filter(\x -> x `mod` 3 == 0 || x `mod` 5 == 0)[1..til])

main = print $  basicAlgo(999)
