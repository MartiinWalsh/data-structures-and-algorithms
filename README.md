# data-structures-and-algorithms
Resource for data structures and algorithms. 

## Table of Contents
### Sorting Algorithms
| Topics | Code |
| ---------- | ---------- |
| [Bubble Sort](#bubble-sort)        | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/BubbleSort/src/com/mcodes/Main.java) | 
| [Selection Sort](#selection-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/SelectionSort/src/com/mcodes/Main.java) |  
| [Insertion Sort](#insertion-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/InsertionSort/src/com/mcodes/Main.java) | 
| [Shell Sort](#shell-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/ShellSort/src/com/mcodes/Main.java) | 
| [Merge Sort](#merge-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/MergeSort/src/com/mcodes/Main.java) | 
| [Quick Sort](#quick-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/QuickSort/src/com/mcodes/Main.java) | 
| [Counting Sort](#counting-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/CountingSort/src/com/mcodes/Main.java) | 
| [Radix Sort](#radix-sort) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/sort-algorithms/RadixSort/src/com/mcodes/Main.java) | 
### Data Structures
| Topics | Code |
| --- | --- |
| [Linked List](#linked-list) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/data-structures/LinkedList-JDK/src/com/mcodes) |
| [Stacks](#stacks) | [Example](https://github.com/m-codes/data-structures-and-algorithms/tree/master/data-structures/Stacks/src/com/mcodes) |
| [Queues](#queues) | [Example](https://github.com/m-codes/data-structures-and-algorithms/blob/master/data-structures/QueuePallindrome/src/com/mcodes/Main.java) |
| [Hashtables](#hashtables) | [Example](#data-structures) |
| [Trees](#trees) | [Example](#data-structures) |
| [Heaps](#heaps) | [Example](#data-structures) |

## Algorithms
### Sorting
#### Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
- Time Complexity: O(n^2) - quadratic 
- In-place algorithm
- Stable algorithm 
#### Selection Sort
Selection sort is an in-place comparison-based algorithm in which the list is divided into two parts, the sorted part at the right end and the unsorted part at the left end. Initially, the sorted part is empty and the unsorted part is the entire list.

The largest element is selected from the unsorted array and swapped with the rightmost element, and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the left.

This can also be done in the oppostie way i.e. Search for the smallest element and swap with leftmost element. 
- Time Complexity: O(n^2) - quadratic 
- In-place algorithm
- Unstable algorithm

#### Insertion Sort
Insertion sort is an in-place comparison-based sorting algorithm. It iterates, consuming one input element each repetition, and growing a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.
- Time Complexity: O(n^2) - quadratic 
- In-place algorithm
- Stable algorithm

#### Shell Sort
Shell sort is a variation of the Insertion sort. Insertion sort chooses which element to insert using a gap of 1, where as Shell sort starts with a larger gap value. As the algortihm runs the gap is reduces. The goal is to try reduce the amount of shifting required.

A common way of calculating the gap is the Knuth Sequence. It calculates the gap using *(3^k-1)/2*. K is set based on the length of the array. Therefore, when using this sequence you should choose a K value that will result in a gap value as close to the array length as possible without being greater than it.
- Time Complexity: Difficult to determine as it depends on the gap. Worst case: O(n^2) 
- In-place algorithm
- Unstable algorithm

#### Merge Sort
Merge Sort is a Divide and Conquer algorithm. It splits the input array in two halves, calls itself for the two halves and then merges the two sorted halves.

**Splitting phase:** Divide the array into two unsorted arrays. First is the left array and the second is the right array. Then split both of these arrays into two arrays each. Repeat until all the arrays have only one element each.

**Merging phase:** Merge every left/right sibling pair into a sorted array. After the first merger there will be multiple 2-element sorted arrays. Repeat untol there is one single sorted array.
- Time Complexity: O(n log n) 
- Not in-place algortithm, as temporary arrays are used.
- Stable algorithm.

#### Quick Sort
Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

1. Always pick first element as pivot.
2. Always pick last element as pivot 
3. Pick a random element as pivot.
4. Pick median as pivot.

Eventually every element will have been the pivot, so each element will be in its correct position. 
- Time Complexity: O(n log n) 
- In-place algortithm.
- Unstable algorithm.

#### Counting Sort
Counting sort is a sorting technique based on keys between a specific range. It works by counting the number of objects having distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each object in the output sequence.
Only works with non negative discrete values.
- Time Complexity: O(n) 
- Not an in-place algortithm.

#### Radix Sort
Radix sort is an integer sorting algorithm that sorts data with integer keys by grouping the keys by individual digits that share the same significant position and value (place value). Radix sort uses counting sort as a subroutine to sort an array of numbers. Because integers can be used to represent strings (by hashing the strings to integers), radix sort works on data types other than just integers. Because radix sort is not comparison based, it is not bounded by (nlogn) for running time, radix sort can perform in linear time.

Radix sort incorporates the counting sort algorithm so that it can sort larger, multi-digit numbers without having to potentially decrease the efficiency by increasing the range of keys the algorithm must sort over.

## Data Stuctures
### Linked List
Linked List is a sequence of links which contains items. Each link contains a connection to another link. Following are the important terms to understand the concept of Linked List.
- Link − Each link of a linked list can store a data called an element.
- Next − Each link of a linked list contains a link to the next link called Next.
- LinkedList − A Linked List contains the connection link to the first link called First.

Following are the various types of linked list.

- Singly Linked List − Item navigation is forward only.
- Doubly Linked List − Items can be navigated forward and backward.
- Circular Linked List − Last item contains link of the first element as next and the first element has a link to the last element as previous.

### Stacks
Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).

The following are basic operations performed on a stack:

- Push: Adds an item in the stack.
- Pop: Removes an item from the stack. 
- Peek or Top: Returns top element of stack.
- isEmpty: Returns true if stack is empty, else false.

### Queues
Queue is an abstract data structure, somewhat similar to Stacks. Unlike stacks, a queue is open at both its ends. One end is always used to insert data (enqueue) and the other is used to remove data (dequeue). Queue follows First-In-First-Out methodology, i.e., the data item stored first will be accessed first.

The following are basic operations performed on a queue:

- enqueue() − add (store) an item to the queue.
- dequeue() − remove (access) an item from the queue.
- peek() − Gets the element at the front of the queue without removing it.
- isfull() − Checks if the queue is full.
- isempty() − Checks if the queue is empty.

### Hashtables
Hash Table is a data structure which stores data in an associative manner. In a hash table, data is stored in an array format, where each data value has its own unique index value. Access of data becomes very fast if we know the index of the desired data.

Thus, it becomes a data structure in which insertion and search operations are very fast irrespective of the size of the data. Hash Table uses an array as a storage medium and uses hash technique to generate an index where an element is to be inserted or is to be located from.
### Trees 
Tree represents the nodes connected by edges. Binary Tree is a special datastructure used for data storage purposes. A binary tree has a special condition that each node can have a maximum of two children. A binary tree has the benefits of both an ordered array and a linked list as search is as quick as in a sorted array and insertion or deletion operation are as fast as in linked list.

The following are basic operations performed on a binary search tree:
- Insert − Inserts an element in a tree/create a tree.
- Search − Searches an element in a tree.
- Preorder Traversal − Traverses a tree in a pre-order manner.
- Inorder Traversal − Traverses a tree in an in-order manner.
- Postorder Traversal − Traverses a tree in a post-order manner.

### Heaps
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

- Max-Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
- Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.