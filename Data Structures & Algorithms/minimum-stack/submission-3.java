class MinStack {
    List <Integer> storage = new ArrayList<Integer>();
    List <Integer> minValueStorage = new ArrayList<Integer>();
    public MinStack() {
        this.storage = new ArrayList<>();
    }
    
    public void push(int val) {
        storage.add(val);
        if(minValueStorage.isEmpty() || val <= minValueStorage.get(minValueStorage.size() - 1)){
            minValueStorage.add(val);
        }
    }
    
    public void pop() {
        int removed = storage.remove(storage.size()-1);
        if(removed == minValueStorage.get(minValueStorage.size()-1)){
            minValueStorage.remove(Integer.valueOf(removed));
        }
        
    }
    
    public int top() {
        return (storage.get(storage.size()-1));
    }
    
    public int getMin() {
        return minValueStorage.get(minValueStorage.size() - 1);
    }
}
