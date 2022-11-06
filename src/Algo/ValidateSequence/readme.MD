Given two non-empty array of integers, write a function that determines whether the second array is a 
subsequence of the first one
A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that 
are in the same order as they appear in the array. For instance, the numbers [1, 3, 4] 
form a subsequence of the array [1, 2, 3, 4], and so do the numbers [2, 4]. Note that a single 
number in an array and the array itself are both valid subsequences of the array.

Sample Input
array = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]

Sample Output
true

Algorithm 1: one loop
O(n)
create a pointer that points to the first element on both arrays
iterate through the array looking if the pointer of the sequence exists
if so, move sequence pointer 1 spot and array pointer 1 spot

while(array pointer < array size; && sequence pointer < sequence size)
    if compare pointers is true
        move both pointers to the right
    else
        move the array pointer to the right

return array pointer == sequence pointer

