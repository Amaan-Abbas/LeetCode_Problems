class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String a: tokens) {
            if(a.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (a.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (a.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (a.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(a));
            }
        }

        return stack.peek();
    }
}