package pr2.generics.queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QueueTest {

    class Fruit { }
    class Apple extends Fruit { }

    @Test
    public void testFifoPrinciple() {
        Queue<String> q = new Queue<>();
        q.offer("A");
        q.offer("B");
        
        assertEquals("A", q.poll(), "(A)");
        assertEquals("B", q.poll(), " (B)");
        assertNull(q.poll(), "null");
    }

    @Test
    public void testAddAllWithExtends() {
        Queue<Fruit> fruitQueue = new Queue<>();
        Queue<Apple> appleQueue = new Queue<>();
        
        appleQueue.offer(new Apple());
        appleQueue.offer(new Apple());


        fruitQueue.addAll(appleQueue);

        assertNotNull(fruitQueue.poll());
        assertNotNull(fruitQueue.poll());
        assertNull(fruitQueue.poll());
    }

    @Test
    public void testCopyIntoWithSuper() {
        Queue<Apple> appleQueue = new Queue<>();
        Queue<Fruit> fruitQueue = new Queue<>();

        appleQueue.offer(new Apple());

        appleQueue.copyInto(fruitQueue);

        assertNotNull(fruitQueue.poll(), "");
    }
}