--ghc 7.10

-- Basic algorithm with O(N) speed
palindrome =
  maximum [x | y<-[100..999], z<-[y..999], let x=y*z, let s=show x, s==reverse s]
  
main = $ palindrome  
