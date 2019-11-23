# Fun-With-Arrays-Strings
This is a class project I worked on during my first semester of JAVA learning at University

HW2 is a class contains the following methods: 


isAlphabeticalOrder takes a String as input and returns a boolean: The method returns true if all the letters of the input string are in alphabetical order, regardless of case. The method returns false otherwise. Do not use arrays to solve this problem. 

> HW2.isAlphabeticalOrder("ac!ffG1h") true > HW2.isAlphabeticalOrder("ac!nfG1h") false 

removeNchars takes a String, an int and a char and returns a String: The output string is the same as the input string except that the first n occurrences of the input char are removed from the string, where n represents the input integer. If there are not n occurrences of the input character, then all occurrences of the character are removed. Do not use arrays to solve this problem. 
> HW2.removeNchars("Hello there!", 2, 'e')
"Hllo thre!"
> HW2.removeNchars("Hello there!", 10, 'e')
"Hllo thr!"
> HW2.removeNchars("Hello there!", 1, 'h')
"Hello tere!"

removeString takes two Strings and returns a String:
The output string should be the same as the first input string except that every(*) occurrence of the second input string should be removed.
(*) If a string exists twice as an overlap (ex: "ellelle" contains two "elle"), the first occurrence is removed.
(*) You do not remove strings that are created by the removal of other strings (ex: "elellele" will create "elle" after removing "elle"). Do not use arrays to solve this problem. 
> HW2.removeString("ellelle", "elle")
"lle"
> HW2.removeString("elellele", "elle")
"elle"
> HW2.removeString("ellellelle", "elle")
"ll"

moveAllXsRight takes a char and a String as input and returns a String:
The output string should be the same as the input string except that every occurrence of the input character should be shifted one character to the right. If it is impossible to shift a character to the right (it is at the end of the string), then it is not shifted. Do not use arrays to solve this problem. 
> HW2.moveAllXsRight('X', "abcXdeXXXfghXiXXjXX")
"abcdXefXXXghiXjXXXX"

moveAllXsdown takes a char and a two dimensional array of char as input and returns nothing:
The method should take every occurrence of the input character and shift it "down" to the next row of the array, and at the same column. If it is impossible to to shift the character down (it is at the "bottom" row or the row below does not have that column), then it is not shifted. Do not use Strings to solve this problem. 
> char[][] board = {{'a','b','c','X'},{'d','X','e','f','X'},{'X','X','i'},{'X','j','k','l'}};
> HW2.moveAllXsDown('X', board)
> board
{ { a, b, c, f }, { d, j, e, X, X }, { X, X, i }, { X, X, k, l } }

moveXDownLeft takes a char and a two dimensional array of char as input and returns nothing:
The method should find the first occurrence of the char in the array (searching from "top" to "bottom" and "left" to "right"), and it should slide that character in the array down and to the left as far as it can go. Any characters on that diagonal are slide up and to the right to fill. Do not use Strings to solve this problem. 
> char[][] board = {{'a','b','c','X'},{'d'},{'e','f','g','h'},{'i','j','k'},{'l','m','n','o'}};
> HW2.moveXDownLeft('X', board)
> board
{ { a, b, c, f }, { d }, { e, i, g, h }, { X, j, k }, { l, m, n, o } }

moveXDownRight: takes a char and a String as input and returns a String. The returned String should take the first occurrence of the input char in the string, and shift it "down" (by skipping over the special end-of-line character '\n', and "right" (by moving it one character to the right each time you pass an end-of-line character). Do not use arrays to solve this problem. 
> HW2.moveXDownRight('X', "Xabc\nd\nefgh\nijk\nlmnop")
"gabc
d
efph
ijk
lmnoX"
