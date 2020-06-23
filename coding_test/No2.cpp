#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
bool solution(vector<int> arr, int n)
{
    // 오름차순 정렬
    sort(arr.begin(), arr.end());
    int startIndex = 0;
    int endIndex = arr.size() - 1;

    int sum;
    while(startIndex < endIndex)
    {
        sum = arr[startIndex] + arr[endIndex];

        // 합이 같을 경우 정답
        if(sum == n)
        {
            return true;
        }
        // 합이 더 클 경우, 뒤인덱스를 한칸 앞으로 전진
        else if(sum > n)
        {
            endIndex -= 1;
        }
        // 합이 더 작을 경우, 앞인덱스를 한칸 뒤으로 전진
        else
        {
            startIndex -= 1;
        }
    }
    return false;
}

int main()
{
    vector<int> arr = {5, 3, 9, 13};

    cout << "1. : ";
    if(solution(arr, 8)) {
        cout << "true";
    } else {
        cout << "false";
    }
    cout << '\n';
    cout << "2. : ";
    if(solution(arr, 7)) {
        cout << "true";
    } else {
        cout << "false";
    }
    cout << '\n';
    system("PAUSE");
    return 0;
}