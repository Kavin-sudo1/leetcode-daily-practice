// Last updated: 1/24/2026, 8:19:57 AM
class Solution {
    public int maxFreqSum(String s) {

      
      int [] fre=new int[26];
      for(char c:s.toCharArray()){
         fre[c-'a']++;
      }
      int vov=0;int con=0;
      char[] vovl="aeiou".toCharArray();
      for(char v:vovl){
         vov=Math.max(vov,fre[v-'a']);
      }
      for(char c='a'; c<='z';c++){
         if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
            con=Math.max(con,fre[c-'a']);
         }
      }
        return (vov+con);
    }
}
        
    