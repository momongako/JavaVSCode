package BTVN03;

import java.util.LinkedList;

public class testlinked {
    private LinkedList l = new LinkedList();

    public void push(Object obj) {
        l.addFirst(obj);
    }

    public Object top() {
        return l.getFirst();
    }

    public Object pop() {
        return l.removeFirst();
    }
}
