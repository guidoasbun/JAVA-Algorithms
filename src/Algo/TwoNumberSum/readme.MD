Write a function that takes  in a non-empty array of distinct integers and an integer representing a target sum. 
If any two numbers in the input array sum up to the target sum, the function should return them in an array, 
in any order. If no two numbers sum up to the target sum, the function should return an empty array.

Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single 
integer to itself in order to obtain the target sum.

You can assume that there will be at most one pair of numbers summing up to the target sum.

Sample Input
array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10

Sample Output
[-1, 11] // the numbers could be in reverse order

Algorithm solution 1: Brute Force
Time: O(n^2) | Space: O(1)

first loop
Go through each element of the array starting at index 0 and ending at index arrayLength -1
    second loop
    start at index + 1 and end at arrayLength
    compare sum of index and index + 1 = target sum
    if true, return array of index and index + 1

return empty 


Algorithm Solution 2: Hash Table 
Time: O(n) | Space: O(n)
Store array into a hash table as the array is iterated

targetSum = 10
currentNum = x

x + y = 10
y = 10 - x

for (all elements in array)
    if targetSum - element is in the hash
        return element and number found in hash
    else 
        add element into hash

return empty array[];


Algorithm Solution 3: Soring the array

sort the array
pointer to 1st element in the sorted array
pointer to last element in the sorted array

compare firstPointer + lastPointer = targetSum
    if comparison is less than target sum, 
        move first pointer to the right
    else
        move second pointer to the left.
return [firstPointer, secondPointer]



