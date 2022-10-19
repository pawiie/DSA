// Binary Search in C++
/*

Steps to taken:
step1: Apply Binary Search in Monntonic Function
step2: mark the middle index of array
step3: compare the middle element with key value

*/

#include <iostream>
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

bool BinarySearch(int arr[], int size, int key)
{
    // init  S and E with find out the mid value
    int start = 0;
    int end = size - 1;
    int mid = start + end / 2;

    // comapre the mid with array size
    while (start <= end)
    {
        if (arr[mid] == key)
        {
            return mid;
        }
    }

    if (key > arr[mid])
    {
        // Left part
        start = mid + 1;
    }
    else
    {
        // right part
        end = mid - 1;
    }
}

int main()
{

    int even[6] = {4, 6, 8, 10, 15, 20};

    int evenindex = BinarySearch(even, 6, 12);
    cout << "index of 12 = " << evenindex << endl;

    return 0;
}
