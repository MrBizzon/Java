// Написать метод, который принимает массив элементов, помещает их в очередь и выводит 
// на консоль содержимое очереди

class Queue {
    private int[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void insert(int elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queue[++rear] = elem;
        nElem++;
    }

    public int remove() {
        int temp = queue[front++];

        if (front == maxSize) {
            front = 0;
        }
        nElem--;
        return temp;

    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public class MyQueue {

        public static void main(String[] args) {
            Queue myQueue = new Queue(5);

            myQueue.insert(1);
            myQueue.insert(2);
            myQueue.insert(3);
            myQueue.insert(4);
            myQueue.insert(5);

            while (!myQueue.isEmpty()) {
                int n = myQueue.remove();
                System.out.println("Элемент: " + n);
            }

        }

    }
}

