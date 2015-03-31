package exercises.basic;

/**
 * Created by vsriram on 3/28/15.
 */
public class BasicHeap {
    String[] buf = new String[1024];
    int last = 0;

    public void add(String s) {
        if (last >= buf.length) {
            throw new RuntimeException("No more space to add elements to this heap");
        }

        buf[last] = s;
        bubbleUp(last);
        last++;

    }

    public String top() {
        if (last == 0) {
            throw new RuntimeException("Heap is empty");
        }

        return buf[0];
    }

    public String pop() {
        if (last == 0) {
            throw new RuntimeException("Heap is empty");
        }

        String result = buf[0];
        buf[0] = buf[last - 1];
        last--;
        bubbleDown(0);
        return result;
    }

    private void bubbleDown(int index) {
        int child1 = index * 2;
        int child2 = child1 + 1;
        if (child1 >= last)
            return;

        if (child1 < last && buf[index].compareTo(buf[child1]) > 0) {
            swap(index, child1);
            bubbleDown(child1);
        } if (child2 < last && buf[index].compareTo(buf[child2]) > 0) {
            swap(index, child2);
            bubbleDown(child2);
        }
    }

    private void bubbleUp(int index) {
        int parent = (int) index / 2;
        if (buf[parent].compareTo(buf[index]) > 0) {
            swap(index, parent);
            bubbleUp(parent);
        }
    }


    private void swap(int a, int b) {
        String t = buf[a];
        buf[a] = buf[b];
        buf[b] = t;
    }

}
