#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void swapAlter(int arr[], int size)
{
    for (int i = 0; i < size; i += 2)
    {
        if (i + 1 < size)
        {
            swap(arr[i], arr[i + 1]);
        }
    }
}

void print(int arr[], int size)
{
    cout << "THE ARRAY AFTER REVERSE: " << endl
         << endl;
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << endl;
    }
}

int main()
{
    cout << "THA ARRAY BEFORE REVERSE: " << endl;
    int arr[6] = {8, 9, 4, 5, 0, 3};
    int size = 6;
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << endl;
    }
    cout << endl;

    // reverse call for alter value
    swapAlter(arr, size);

    print(arr, size);

    return 0;
}
