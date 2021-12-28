class MyHashMap {
    
    ArrayList<Pair> lst;

    class Pair {
        int[] store;
        
        Pair(int i, int j) {
            store = new int[2];
            store[0] = i;
            store[1] = j;
        }
    }

    public MyHashMap() {
        lst = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for (int i = 0; i < lst.size(); i++) {
            Pair curr = lst.get(i);
            if(curr.store[0] == key) {
                lst.set(i, new Pair(curr.store[0], value));
                return;
            }
        }
        lst.add(new Pair(key, value));
        return;
    }
    
    public int get(int key) {
        for (int i = 0; i < lst.size(); i++) {
            Pair curr = lst.get(i);
            if(curr.store[0] == key) {
                return curr.store[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for (int i = 0; i < lst.size(); i++) {
            Pair curr = lst.get(i);
            if(curr.store[0] == key) {
                lst.remove(i);
                return;
            }
        }        
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */