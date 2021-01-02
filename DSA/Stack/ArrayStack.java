public class ArrayStack {
    public int capacity;
    public int top;
    public int [] stack;
    //initalize top = -1 and get capacity;
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        top = -1;
        stack = new int[capacity];
    }
    //push the element into the stack
    public void push(int element){
        if(top >= capacity) {
            System.out.print("Stack is full");
        }else {
            top = top + 1;
            stack[top] = element;
        }
    }
    public void printStack() {
        for(int i = 0; i < top; i++) {
            System.out.print(stack[i]+" ");
        }
    }
    public static void main(String[] args){
        ArrayStack as = new ArrayStack(10);
        as.push(10);
        as.push(20);
        as.push(30);
        as.printStack();
    }
}