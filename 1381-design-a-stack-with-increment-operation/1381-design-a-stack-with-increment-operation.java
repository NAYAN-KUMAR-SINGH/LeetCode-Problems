class CustomStack {
    int[] arr;
    int[] increments;
    int size = 0;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        increments = new int[maxSize];
    }

    public void push(int x) {
        if (size < maxSize) {
            arr[size] = x;
            size++;
        }
    }

    public int pop() {
        if (size == 0) return -1;
        size--;
        int value = arr[size] + increments[size];
        if (size > 0) {
            increments[size - 1] += increments[size];
        }
        increments[size] = 0;
        return value;
    }

    public void increment(int k, int val) {
        if (k > size) {
            k = size;
        }
        if (k > 0) {
            increments[k - 1] += val;
        }
    }
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */