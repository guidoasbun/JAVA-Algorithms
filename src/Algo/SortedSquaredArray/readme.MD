Write a function that takes in a non-empty array of integers 
that are sorted in ascending order and returns a new array of 
the same length with the squares of the original integers also 
sorted in ascending order.

Sample Input
array = [1, 2, 3, 5, 6, 8, 9]
solution: [1, 4, 9, 25, 36, 64, 81]

array2 = [-7, -3, 1, 9, 22, 30]
solution2: [1, 9, 49, 81, 484, 900]

Solution
Brute Force
Square each element in the array and sort the output array.

Time Complexity
O(nlogn) time | O(n) space

Optimal Solution

initialize empty output array
initialize start and end pointers.

for index = array length -1 to index >= 0; index--
    compare value of both pointers
    if abs val of start pointer > abs val of end pointer
        output[index] = start pointer ^2
        start pointer++;
    else
        output[index] = end pointer ^2
        end pointer --;

return output

