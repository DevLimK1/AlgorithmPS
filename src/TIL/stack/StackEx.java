package TIL.stack;

import java.util.EmptyStackException;

class Stack<T>{
    Node<T> top=null;
    int size=0;

    class Node<T>{
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }


    }

    public void push(T data){
        Node<T> node=new Node<T>(data);
        node.next=top;
        top=node;

        size++;
    }

    public T peek(){
        if(size<=0||top==null)
            throw new EmptyStackException();

        return top.data;
    }

    public T pop(){
        if(size<=0||top==null)
            throw new EmptyStackException();
        size--;

        T data=top.data;
        top=top.next;

        return data;
    }

    public boolean isEmpty() {

        return top == null && size == 0;
    }

    public int size() {

        return size;
    }

    public void empty() {
        size = 0;
        top = null;
    }


}

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("==== size : " + st.size());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println("==== size : " + st.size());
        System.out.println(st.peek());
        System.out.println("==== empty : " + st.isEmpty());
        System.out.println("==== size : " + st.size());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println("==== empty : " + st.isEmpty());
        System.out.println("==== size : " + st.size());
        System.out.println(st.isEmpty());

    }
}
