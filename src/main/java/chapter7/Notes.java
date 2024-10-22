package chapter7;

public class Notes {
    /*
    Sequential Search
The first approach is to use a sequential search algorithm. The sequential search algorithm searches every element in the array until it finds the value that it's looking for. Or, until it arrives at the end of the array.

This algorithm is okay for small arrays but it's inefficient for arrays with more than several thousand elements.


#Binary Search
Another search algorithm is the binary search. For the binary search the array must first be sorted.

So, in the case of our lottery ticket array, the elements would need to be in ascending order from least to greatest. Then you will write code that will begin the search, by checking the element in the middle of the array, to see if it's equal, greater than, or less than the value that you're searching for.

If it's greater than, then there's no need to search the entire second half of the array. Because we know, that everything over there will be greater than as well. And the element you're searching for is definitely not over there.

Likewise, if the middle number is less than the value you're searching for, then there's no need to search the entire first half of the array.

And if the value is equal, you're lucky and you're done.

Arrays.binarySearch().


     */
}
