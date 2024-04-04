/* URL : https://leetcode.com/problems/implement-queue-using-stacks/description/ */
class MyQueue {
    int[] data;
    int top;
    int[] helper;
    int helperTop;
    public MyQueue() {
        data = new int[10];
        helper = new int[10];
        top = -1;
        helperTop = -1;
    }

    public void sizeInc() {
        int[] temp = new int[data.length * 2];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
        int[] helperTemp = new int[data.length*2];
        helper = helperTemp;
    }
    
    public void push(int x) {
        if(full()) {
            sizeInc();
        }
        if( top == -1) {
            data[++top] = x;
        } else {
            while(!empty()) {
                helper[++helperTop] = pop();
            }
            push(x);
            while(helperTop != -1) {
                data[++top] = helper[helperTop--];
            }
        }
    }

    public boolean full() {
        return (top == data.length -1 );
    }
    
    public int pop() {
        if(empty()) {
            return -1;
        }
        return data[top--];
    }
    
    public int peek() {
        return data[top];
    }
    
    public boolean empty() {
        return (top == -1);
    }
}
