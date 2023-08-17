class Solution {
    public String[] findWords(String[] words) {
       String a="asdfghjkl";
       String b="qwertyuiop";
       String c="zxcvbnm";
     List<String> lis=new LinkedList<>();
     for(String word:words)
     {
         int[] rows=new int[3];
         for(char ch:word.toLowerCase().toCharArray())
         {
             if(a.indexOf(ch)!=-1)
             {
                 rows[0]=1;

             }
               if(b.indexOf(ch)!=-1)
             {
                 rows[1]=1;
                 
             }
               if(c.indexOf(ch)!=-1)
             {
                 rows[2]=1;
                 
             }

         }
         int sum=rows[0]+rows[1]+rows[2];
         if(sum==1)
         {
             lis.add(word);
         }
     }
     String[] arr=new String[lis.size()];
     int i=0;
     for(String acb:lis)
     {
         arr[i++]=acb;
     }
     return arr;
    }
}
