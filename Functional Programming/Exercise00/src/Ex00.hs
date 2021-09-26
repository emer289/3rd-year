module Ex00 where

name, idno, username :: String
name      =  "Murphy, Emer"  -- replace with your name
idno      =  "18340180"    -- replace with your student id
username  =  "murphe65"   -- replace with your TCD username


declaration -- do NOT modify this
 = unlines
     [ ""
     , "@@@ This exercise is all my own work."
     , "@@@ Signed: " ++ name
     , "@@@ "++idno++" "++username
     ]

{- Modify everything below here to ensure all tests pass -}

hello  =  "Hello World :-)"