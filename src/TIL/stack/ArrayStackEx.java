package TIL.stack;

class ArrayStack{
    private int top;
    private int maxSize;
    private Object[] stackArray;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray=new Object[maxSize];
        this.top=-1;
    }

    public boolean empty(){
        return (top==-1);
    }

    public boolean full(){
        return (top==maxSize-1);
    }

    public void push(Object item){
        if(full()){
            throw new ArrayIndexOutOfBoundsException((top+1)+">="+maxSize);
        }

        stackArray[++top]=item;
    }

    public Object peek(){
        if(empty())
            throw new ArrayIndexOutOfBoundsException(top);

        return stackArray[top];
    }

    public Object pop(){
        Object item=peek();

        top--;
        return item;
    }
}

public class ArrayStackEx {
    public static void main(String[] args) {
        // 크기 5의 배열 스택 생성
        ArrayStack arrayStack = new ArrayStack(5);

        System.out.println("Array Stack 테스트");

        // 스택에 데이터 삽입
        for(int i=1; i<=5; i++){
            arrayStack.push("ArrayStack 데이터-" + i);
        }
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

        System.out.println();

    }
}
