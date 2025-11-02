public class MinStack {
    private int[] stack;
    private int[] minStack;
    private int top; 
    private int capacity;

    
    public MinStack() {
        capacity = 10000; 
        stack = new int[capacity];
        minStack = new int[capacity];
        top = -1;
    }


    public void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = val;

        if (top == 0) {
            minStack[top] = val;
        } else {
            minStack[top] = Math.min(val, minStack[top - 1]);
        }
    }

    
    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }

    
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }


    public int getMin() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack[top];
    }

    
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum: " + minStack.getMin()); 
        minStack.pop();
        System.out.println("Top: " + minStack.top());        
        System.out.println("Minimum: " + minStack.getMin()); 
    }
}