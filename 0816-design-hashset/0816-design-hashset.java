class MyHashSet 
{
    List<Integer> set;
    int i;
    public MyHashSet() 
    {
        set = new ArrayList<>();
    }
    
    public void add(int key) 
    {
        if(!contains(key))
            set.add(key);
    }
    
    public void remove(int key) 
    {
        for(int j=0;j<set.size();j++)
        {
            if(set.get(j) == key)
                set.remove(j);
        }
    }
    
    public boolean contains(int key) 
    {
        for(int j=0;j<set.size();j++)
        {
            if(set.get(j) == key)
                return true;
        }        
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */