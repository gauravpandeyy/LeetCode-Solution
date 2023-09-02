class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String ,Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
		{
             if(hm.containsKey(arr[i]))
			 {
                   hm.put(arr[i] , hm.get(arr[i]) + 1);
             }
            else{
                hm.put(arr[i] , 1);
            }
        }
        for(int i=0; i<arr.length; i++)
		{
                    if(hm.get(arr[i]) == 1)
					{
                        k--;
						   if(k == 0)
				     	{
                       return arr[i];
                        }
                    }
                 
        }
        
        return "";
        
    }
}
// b b