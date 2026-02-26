// Last updated: 2/26/2026, 2:23:08 AM
1class Solution {
2    public boolean isValid(String s) {
3    Stack<Character>  st= new Stack();
4    char[] ch=s.toCharArray();
5    for(char c:ch){
6        if(c=='(' || c=='{' || c=='[') st.push(c);
7        else{
8            if(st.empty()) return false;
9            else if(c==')' && st.peek()=='(') st.pop();
10            else if(c=='}' && st.peek()=='{') st.pop();
11            else if(c==']' && st.peek()=='[') st.pop();
12            else  return false;
13           
14           
15        
16        } 
17    }
18 return st.empty();
19        
20    }
21}