package exercises.basic;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by vsriram on 3/30/15.
 */
public class BasicHeapTest extends TestCase {

    public void testAdd() throws Exception {
        BasicHeap bh = new BasicHeap();
        bh.add("ttt");
        Assert.assertEquals("ttt", bh.top());
        bh.add("eee");
        Assert.assertEquals("eee", bh.top());
        bh.add("uuu");
        Assert.assertEquals("eee", bh.top());
        bh.add("ccc");
        Assert.assertEquals("ccc", bh.top());
        bh.add("hhh");
        Assert.assertEquals("ccc", bh.top());
        bh.add("ddd");
        Assert.assertEquals("ccc", bh.top());
        bh.add("aaa");
        Assert.assertEquals("aaa", bh.top());
        bh.add("bbb");
        Assert.assertEquals("aaa", bh.top());
    }

    public void testTop() throws Exception {

    }

    public void testPop() throws Exception {
        BasicHeap bh = new BasicHeap();
        bh.add("ttt");
        bh.add("eee");
        bh.add("uuu");
        bh.add("ccc");
        bh.add("hhh");
        bh.add("ddd");
        bh.add("aaa");
        bh.add("bbb");
        Assert.assertEquals("aaa", bh.pop());
        Assert.assertEquals("bbb", bh.pop());
        Assert.assertEquals("ccc", bh.pop());
        Assert.assertEquals("ddd", bh.pop());
        Assert.assertEquals("eee", bh.pop());
        Assert.assertEquals("hhh", bh.pop());
        Assert.assertEquals("ttt", bh.pop());

    }
}