#include <iostream>

using namespace std;
int solution(int n)
{
    int answer = 0;

    while (n > 0)
    {
        answer += n % 10;
        n /= 10;
        // 합이 두자리수 일 때, 한번더 합하여 한자리로 만듬
        if (answer > 10)
        {
            answer = answer / 10 + answer % 10;
        }
    }

    return answer;
}

int main()
{
    cout << solution(10);
    cout << '\n';
    cout << solution(456789);
    cout << '\n';
    system("PAUSE");
    return 0;
}