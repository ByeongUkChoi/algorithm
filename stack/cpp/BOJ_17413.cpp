/*
문제
문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.

먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.

알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
문자열의 시작과 끝은 공백이 아니다.
'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

출력
첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

https://www.acmicpc.net/problem/17413

---
*/

#include <iostream>
#include <string>
#include <stack>
using namespace std;

// 스택에 있는 수를 모두 출력하는 함수(거꾸로 출력됨)
void print(stack<char> &s) {
    while (!s.empty()) {
        cout << s.top();
        s.pop();
    }
}
int main() {
    string str;
    getline(cin, str);  // std::getline(). 입력받은 문자열을 str에 저장
    bool tag = false;   // 태그 내부 인지 확인하는 값
    stack<char> s;      // 뒤집을 단어를 넣을 공간
    for (char ch : str) {   // 입력 받은 문자열을 한글자씩 반복
        if (ch == '<') {    // 태그의 시작
            print(s);       // 단어 뒤집기
            tag = true;     // 태그
            cout << ch;     // '<' 문자 출력
        } else if (ch == '>') { // 태그 끝남
            tag = false;
            cout << ch;         // '>' 문자 출력
        } else if (tag) {   // 태그 안에 문자일 경우
            cout << ch;     // 뒤집지 않고 그대로 출력
        } else {    // 태그가 아닌 경우
            if (ch == ' ') { // 공백
                print(s);       // 단어 뒤집기
                cout << ch;     // 공백 문자 출력
            } else {
                s.push(ch);     //뒤집기
            }
        }
    }
    print(s);   // 남아있는 단어 뒤집기
    cout << '\n';
    return 0;
}