import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

import java.util.Arrays;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class ResizableArrayStackTest {
    StackInterface <String> stack1 = new ResizableArrayStack<>();
    @Test
    void push() {
        stack1.push("A");
        String top = stack1.peek();
        System.out.println(top);
    }

    @Test
    void pop() {
        stack1.push("A");
        String top = stack1.pop();
        if (stack1.isEmpty()) {
            System.out.println(top);
            System.out.println("Stack is empty");
        }
    }

    @Test
    void peek() {
        stack1.push("A");
        String top = stack1.peek();
        System.out.println(top);
    }

    @Test
    void isEmpty() {
        stack1.push("A");
        stack1.clear();
        if (stack1.isEmpty()) {
            System.out.println("Stack is empty");
        }
    }

    @Test
    void clear() {
        stack1.push("A");
        String top = stack1.peek();
        System.out.println(top);
        stack1.clear();
        try {
            top = stack1.peek();
        }
        catch(EmptyStackException e) {
            System.out.println("Exception caught: Stack is empty");
        }

    }
}
