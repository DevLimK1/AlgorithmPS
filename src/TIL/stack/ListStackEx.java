package TIL.stack;

class ListStack {
    private Node top;

    private class Node {
        private Object data;
        private Node nextNode;

        Node(Object data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public ListStack() {
        this.top = null;
    }

    public boolean empty() {
        return top == null;
    }

    //맨 앞에 노드가 top이 된다.
    public void push(Object item) {
        Node newNode = new Node(item);
        newNode.nextNode = top;
        top = newNode;
    }

    public Object peek() {
        if (empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;

    }

    public Object pop() {
        Object item = peek();
        top = top.nextNode;
        return item;
    }


}

public class ListStackEx {
    public static void main(String[] args) {
        // 연결리스트 스택 생성
        ListStack listStack = new ListStack();

        System.out.println("List Stack 테스트");

        // 스택에 데이터 삽입
        for(int i=1; i<=5; i++){
            listStack.push("ListStack 데이터-"+i);
        }

        listStack.push("ListStack 데이터-6");

        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.peek());
        System.out.println(listStack.peek());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());

    }
}
