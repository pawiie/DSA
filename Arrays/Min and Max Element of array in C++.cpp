#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int getMin(int num[], int n)
{
    int min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (num[i] < min)
        {
            min = num[i];
        }
    }
    return min;
}

int getMax(int num[], int n)
{
    int max = INT_MIN;
    for (int i = 0; i < n; i++)
    {

        if (num[i] > max)
        {
            max = num[i];
        }
    }
    return max;
}

int main()
{
    // init of size of an array ex. = 5 which is under 100
    int size;
    // cout << "Enter the size you want: " << endl;
    cin >> size;
    // Max limit of array size
    int num[100];

    // print the array
    for (int i = 0; i < size; i++)
    {
        cout << "My array is: " << num[i] << endl;
    }

    cout << "Min value: " << getMin(num, size) << endl;
    cout << "Max value: " << getMax(num, size) << endl;

    return 0;
}
