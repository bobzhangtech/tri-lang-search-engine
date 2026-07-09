# My thoughts from planning to complete

## Planning

Goal: build the same mini search engine logic in Java, C, and C++, and have them accessible in a unified CLI program

Steps on how the project would function (rough draft):
1. Read text files from a folder
2. Break text into words
3. Count word frequency per file
4. Let the user search for a word
5. Show files ranked by number of matches

Visualized project usage flow:
* Run a single CLI program (particular language to build it to be determined)
* Give language options
```
Mini Search Engine
1. Java
2. C
3. C++
Select a language:
```
* Call the main file of the selected language, let's say Java, for instance
* Ask the user for a word
```
Search for a word: 
```
* Output the result
```
Search for a word: apple

1. file_1.txt - 8 matches
2. file_2.txt - 6 matches
3. file_3.txt - 1 match
4. file_4.txt - 0 matches
5. file_5.txt - 0 matches
```