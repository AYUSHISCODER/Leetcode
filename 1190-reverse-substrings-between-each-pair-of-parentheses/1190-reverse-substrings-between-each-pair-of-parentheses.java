class Solution {
    public String reverseParentheses(String s) {
Stack<Character> stack = new Stack<>();
 for (char ch : s.toCharArray()) {
if (ch == ')') {

    String temp = "";

     while (stack.peek() != '(') {
             temp = temp + stack.pop();
    }
 stack.pop(); 
for (int i = 0; i < temp.length(); i++) {
                    stack.push(temp.charAt(i));
                }

            } else {
                stack.push(ch);
            }
        }
String ans = "";
while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }

        return ans;
    }
}