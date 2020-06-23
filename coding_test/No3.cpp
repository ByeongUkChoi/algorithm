#include <iostream>

using namespace std;
int solution(string str)
{
    // 주기 길이
    int answer;
    // 문자열 길이
    int strLength = str.size();
    // 주기 문자열
    string cycleStr;
    // 주기 여부
    bool isCycleStr;


    // 주기 길이를 증가하며 반복
    for (answer = 1; answer < strLength; answer++)
    {
        // 주기 길이 맞지 않을 경우 pass
        if(strLength % answer)
        {
            continue;
        }

        isCycleStr = true;

        cycleStr = str.substr(0, answer);

        // 주기가 맞는지 전체 돌면서 확인
        for (int i = 1, count = strLength / answer; i < count; i++)
        {
            if(cycleStr != str.substr(i * answer, answer))
            {
                isCycleStr = false;
                break;
            }
        }
        // 주기 문자열이 맞는 경우 반환
        if(isCycleStr)
        {
            return answer;
        }
    }
    return answer;
}

int main()
{
    cout << solution("abababab");
    cout << '\n';
    cout << solution("abcabcabd");
    cout << '\n';
    cout << solution("ababababa");
    cout << '\n';
    cout << solution("abcabcabc");
    cout << '\n';
    cout << solution("bbbbbbbbb");
    cout << '\n';
    system("PAUSE");
    return 0;
}