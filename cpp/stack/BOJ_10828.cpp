/*
#스택

##문제
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

##입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

##출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

https://www.acmicpc.net/problem/10828

---
라이브러리 사용하지 않고 스택 직접 구현

cout 한글 깨짐 방지
#include <windows.h>
#pragma execution_character_set( "utf-8" );
SetConsoleOutputCP(65001);

*/
#include <iostream>
#include <string>
#include <windows.h>
using namespace std;
#pragma execution_character_set( "utf-8" );
struct Stack {
    int data[10000];
    int size;
    Stack() {
        size = 0;
    }
    void push(int num) {
        data[size] = num;
        size += 1;
    }
    bool empty() {
        return size == 0 ? true : false;
    }
    int pop() {
        if (empty()) {
            return -1;
        } else {
            size -= 1;
            return data[size];
        }
    }
    int top() {
        if (empty()) {
            return -1;
        } else {
            return data[size-1];
        }
    }
};
int main() {
    SetConsoleOutputCP(65001);
    int n;
    // test
    //cout << "반복할 횟수 n을 입력하세요 : ";
    cin >> n;

    Stack s;

    while (n--) {
        // test
        //cout << "커맨드(push,top,size,empty,pop)를 입력하세요 : ";
        string cmd;
        cin >> cmd;
        if(cmd == "push") {
            int num;
            cin >> num;
            s.push(num);
        } else if (cmd == "top") {
            cout << (s.empty() ? -1 : s.top()) << '\n';
        } else if (cmd == "size") {
            cout << s.size << '\n';
        } else if (cmd == "empty") {
            cout << s.empty() << '\n';
        } else if (cmd == "pop") {
            cout << (s.empty() ? -1 : s.top()) << '\n';
            if (!s.empty()) {
                s.pop();
            }
        }
        // test
        //cout << "남은 횟수 : " << n << "회\n";
    }
    return 0;
}