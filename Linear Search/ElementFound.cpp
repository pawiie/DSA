#include <iostream>
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

bool search(int arr[], int size, int key)
{
    for (int i = 0; i < 5; i++)
    {
        if (arr[i] == key)
        {
            return 1;
        }
        return 0;
    }
}

int main()
{
    int arr[5] = {9, -1, 0, 2, 5};
    int size = 5;
    int key;
    cout << "Enter the Key Value: " << endl;
    cin >> key;

    bool found = search(arr, 5, key);

    if (found)
    {
        cout << "OUR KEY VALUE IS IN THE ARRAY: TRUE " << endl;
    }
    else
    {
        cout << "OUR KEY VALUE IS NOT IN THE ARRAY: FALSE " << endl;
    }
    return 0;
}
