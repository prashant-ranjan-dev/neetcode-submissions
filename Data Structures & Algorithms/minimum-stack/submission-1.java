class MinStack {
    List <Integer> storage = new ArrayList<Integer>();
    List <Integer> minValueStorage = new ArrayList<Integer>();
    public MinStack() {
        this.storage = new ArrayList<>();
    }
    int minElement = Integer.MAX_VALUE;
    public void push(int val) {
        if(minValueStorage.size() < 1){
            minValueStorage.add(val);
        } else {
            int i = 0;
            while((i <= minValueStorage.size()-1) && (minValueStorage.get(i) <= val)){
                i++;
            }
            minValueStorage.add(i, val);
        }
        
        storage.add(val);
    }
    
    public void pop() {
        int value = storage.remove(storage.size()-1);
        minValueStorage.remove(Integer.valueOf(value));
    }
    
    public int top() {
        return (storage.get(storage.size()-1));
    }
    
    public int getMin() {
        return minValueStorage.get(0);
    }
}
