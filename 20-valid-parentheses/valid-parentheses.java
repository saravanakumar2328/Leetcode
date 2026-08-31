class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            // Opening brackets → Push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }

            // Closing brackets
            else {
                // Stack is empty
                if (top == -1) {
                    return false;
                }

                char open = stack[top--];

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty
        return top == -1;
    }
}