package stack;

/**
 * stack
 */
interface Stack {
    // 스택이 비어있는지
    public boolean isEmpty();
    // 맨 위에 아이템을 빼서 가져온다
    public Object pop();
    // 맨 위에 아이템을 추가한다
    public void push(Object item);
    // 맨 위에 아이템을 가져온다 (빼지 않음)
    public Object peek();
    // 추가로 isFull(꽉찼는지 여부), isClear(초기화)가 있을 수 있으나 연결리스트로 구현하면 의미가 없어보인다.
}
