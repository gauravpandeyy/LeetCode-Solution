class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> st=new HashSet<>();
        for(List<String> lt:paths)
        {
st.add(lt.get(0));
        }
      for(List<String> lt:paths)
        {
            if(!st.contains(lt.get(1)))
            {
                return lt.get(1);
            }
        }
        return null;
        
    }
}