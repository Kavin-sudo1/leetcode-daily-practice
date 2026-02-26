// Last updated: 2/26/2026, 2:21:20 AM
1class Solution {
2    public int romanToInt(String s) {
3        Map<Character,Integer> map = new HashMap<>();
4        map.put('I',1);
5        map.put('V',5);
6        map.put('X',10);
7        map.put('L',50);
8        map.put('C',100);
9        map.put('D',500);
10        map.put('M',1000);
11
12        int result = 0;
13        for (int i = 0; i < s.length(); i++) {
14            int value = map.get(s.charAt(i));
15            if ((i + 1) < s.length() && value < map.get(s.charAt(i + 1))) result -= value;  
16              else result += value;  
17                
18            
19        }
20        return result;
21    }
22}