// Last updated: 3/1/2026, 8:53:07 AM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        char[] arr=s.toCharArray();
4        for(int i=s.length()-1;i>=0;i--){
5            if(arr[i]=='a'|| arr[i]=='e' || arr[i]=='i' ||arr[i]=='o' || arr[i]=='u'){
6               continue;
7            }else{
8                return s.substring(0,i+1);
9            }
10        }
11        return "";
12        
13    }
14}