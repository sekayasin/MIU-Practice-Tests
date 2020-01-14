Question 25
An isSym (even/odd Symmetric) array is defined to be an array in which even numbers
and odd numbers appear in the same order from "both directions".
You can assume array has at least one element.
{2,7,9,10,11,5,8} is a isSym array.
Note that from left to right or right to left we have even,odd,odd,even,odd,odd,even.

{9,8,7,13,14,17} is a isSym array.
Note from left to right or right to left we have {odd,even,odd,odd,even,odd}

However, {2,7,8,9,11,13,10} is NOT a isSym array.
From left to right we have {even,odd,even,odd,odd,odd,even}
From right to left we have {even,odd,odd,odd,even,odd,even} which is not the same.

Write a function named isSym that returns 1 if its array argument is a isSym array,
otherwise it returns 0.

if you are programming in Java or C#, the function signature is:
int isSym(int[] a)

if you are programming in C or C++, the function is:
int isSym(int a[], int len) where len is the number of elements in the array.