/* URL : https://leetcode.com/problems/design-a-stack-with-increment-operation/description/ */
class CustomStack {
    int[] data;
    int top;
    public CustomStack(int maxSize) {
        data = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top < data.length-1) {
            data[++top] = x;
        }
    }
    
    public int pop() {
        if(top == -1) {
            return -1;
        }
        return data[top--]; 
    }
    
    public void increment(int k, int val) {
        int size = top+1;
        if(k >= size) {
            k = size;
        }
        int i = 0;
        while(k-->0) {
            data[i] += val;
            i++;
        }
        
    }
}
