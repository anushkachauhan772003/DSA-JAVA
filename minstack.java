import java.util.*;
public class minstack {
    Stack<Integer>stack=new Stack<>();
        public minstack() {
         minstack minsTack=new minstack();
        }
        
        public void push(int val) {
            stack.push(val);
        }
        
        public void pop() {
           stack.pop();
        }
        
        public int top() {
            return stack.pop();
        }
        
        public int getMin() {
            int min=0;
            while(!stack.isEmpty()){
                
            }
            return min;
        }

    }
