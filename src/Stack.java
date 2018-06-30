import java.util.EmptyStackException;

public class Stack
{
    private long arr[] = new long[10];
    private int index = 0;
    public void push(Long i) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = i;
        index++;
    }
    public Long pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println("index is : "+index);
        return arr[--index];
    }
    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == 10;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5L);
        stack.push(1L);
        stack.push(2L);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
