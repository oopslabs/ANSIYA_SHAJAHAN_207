package java;
import java.util.Scanner;

class  Stack
{
        
        static void push(Stack , int a)
        {
                push(new Integer(a));
                System.out.println("Element "+a+" push to Stack");
                System.out.println("Stack is: " + st);
        }
        
        static void pop(Stack )
        {
                int a =  pop();
                System.out.println("Element "+a+" pop to the stack");
                System.out.println("Stack is: " + st);
        }
        public static void main(String[] args)
        {
                
                
                        Stack stack = new Stack();
                        System.out.println("Stack: "+stack);
                        push(stack, 12);
                        push(stack, 15);
                        push(stack, 32);
                        push(stack, 54);
                        pop(stack);
                        pop(stack);
                       
                        
                        
                
                }
        }


