public class App {
    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        while (!stack.isEmpyt()){
           int val = stack.pop();
            System.out.println(val);
        }

        stack.pop();

    }
}
