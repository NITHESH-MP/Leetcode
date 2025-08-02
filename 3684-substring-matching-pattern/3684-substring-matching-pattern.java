class Solution {
    public boolean hasMatch(String s, String p) 
    {
        if(p.equals('*'))
            return true;

        int start = p.indexOf('*');
        String prefix = p.substring(0, start);
        String suffix = p.substring(start+1, p.length());

               
        int pstart = s.indexOf(prefix);
        int send = s.lastIndexOf(suffix); 
         
         
       if(pstart != -1 && send != -1 && pstart + prefix.length() <= send)
            return true;

        return false;
    }
}