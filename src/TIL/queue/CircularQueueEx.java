package TIL.queue;


//https://songeunjung92.tistory.com/23
class CircularQueue{
    private char[] itemArray;
    private int front;
    private int rear;
    private int queueSize;

    public CircularQueue(int queueSize){
        this.front=0;
        this.rear=0;
        this.queueSize=queueSize;
        itemArray=new char[queueSize];
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public boolean isFull(){
        return ((rear+1)%queueSize == front) ;
    }

    public void enQueue(char item)  {
        if(isFull())
            System.out.println("포화상태");
        else{
            rear=(rear+1)%queueSize;
            itemArray[rear]=item;
        }

    }

    //큐 삭제 후 반환
    public char deQueue(){
        if(isEmpty()){
            System.out.println("공백 상태");
            return 0;
        }else{
            front=(front+1)%queueSize;
            return itemArray[front];
        }
    }

    //큐 삭제
    public void delete() {
        if(isEmpty()){
            System.out.println("삭제할 큐가 없음");
        }else{
            front = (front+1)%queueSize;
        }
    }

    public char peek(){
        if(isEmpty()){
            System.out.println("큐 비어있음");
            return 0;
        }
        else{
            return itemArray[(front+1)%queueSize];
        }
    }

    //전체 큐값 출력
    public void print(){
        if(isEmpty()){
            System.out.println("큐 비어있음");
        }
        else{
            int f=front;

            while(f!=rear){
                f=(f+1)%queueSize;
                System.out.print(itemArray[f]+" ");
            }
            System.out.println();
        }
    }

}

public class CircularQueueEx {
    public static void main(String[] args) {
        int queueSize = 4;
        char deletedItem;
        CircularQueue queue = new CircularQueue(queueSize);

        queue.enQueue('A');
        queue.print();

        queue.enQueue('B');
        queue.print();

        deletedItem = queue.deQueue();
        if(deletedItem!=0){
            System.out.println("deleteItem : " + deletedItem);
        }
        queue.print();

        queue.enQueue('C');
        queue.print();

        queue.enQueue('D');
        queue.print();

        queue.enQueue('F');
        queue.print();

        deletedItem = queue.deQueue();
        if(deletedItem!=0){
            System.out.println("deleteItem : " + deletedItem);
        }
        queue.print();

        queue.enQueue('F');
        queue.print();


    }
}
