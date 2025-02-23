package stack.practice;

import java.util.Stack;

public class QueueUsingStack {

    //stack1 for enqueue
    //stack2 for dequeue

    private Stack stack1;
    private Stack stack2;
    private  int size;



    public QueueUsingStack(int size){
        this.size=size;
        stack1=new Stack(this.size);
        stack2=new Stack()
    }
}
