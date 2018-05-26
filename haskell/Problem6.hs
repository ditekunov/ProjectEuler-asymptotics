--ghc 7.10

sm :: Int -> Int
squared :: Int -> Int

-- Improved algorithm with O(1) speed
sm til = 
  til * (til+1)/ 2
  
squared til = 
  (til * (til + 1) * (2 * til + 1)) / 6
    
    
main = 
    print $ (sm * sm - squared)
