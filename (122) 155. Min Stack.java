/* URL : https://leetcode.com/problems/min-stack/description/ */
class MinStack {
    int[] data;
    int top;
    int min;
    public MinStack() {
        top = -1;
        min = -1;
        data = new int[10];
    }

    public boolean isFull(){
        if(top == data.length-1) {
            return true;
        }
        return false;
    }
    
    public void sizeUp() {
        int[] temp = new int[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void push(int val) {
        if(isFull()){
            sizeUp();
        }
        data[++top] = val;
        if(min == -1 || data[min] > val) {
            min = top;
        }
    }
    
    public void pop() {
        if(top == min) {
            int newMin = 0;
            for(int i = 0; i < top; i++) {
                if(data[newMin] > data[i]) {
                    newMin = i;
                }
            }
            min = newMin;
        }
        top--;
    }
    
    public int top() {
        return data[top];
    }
    
    public int getMin() {
        return data[min];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
