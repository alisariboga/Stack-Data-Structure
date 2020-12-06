public class StackImpl<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    StackImpl(int size) {
        this.maxSize = size;
        stackArray = new Object[this.maxSize];
        this.top = -1;
    }

    public void push(Object newItem) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        }
        top = top + 1;
        stackArray[top] = newItem;

    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public T pop() {
        if (isEmpyt()){
            System.out.println("Stack is empty");
            return null;
        }
        T item = (T) stackArray[top];
        top = top-1;
        return item;
    }
    public boolean isEmpyt() {
        return (top == -1);
    }
}
