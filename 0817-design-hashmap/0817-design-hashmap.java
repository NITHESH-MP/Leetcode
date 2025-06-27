class MyHashMap 
{
    boolean[] key;
    int[] value;
    public MyHashMap() 
    {
        key = new boolean[10000001];
        value = new int[10000001];    
    }
    
    public void put(int k, int v) 
    {
        key[k] = true;
        value[k] =  v;  
    }
    
    public int get(int k) 
    {
        if(key[k] == true)
            return value[k];
        return -1;  
    }
    
    public void remove(int k) 
    {
        key[k] = false;
        value[k] = 0; 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */