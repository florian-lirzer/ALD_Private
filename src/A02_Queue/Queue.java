package A02_Queue;

public class Queue<T>
{
    private Node<T> first;
    
    private Node<T> last;

    private int counter;
    /**
     * Das vorderste (=erste) Element aus der Queue entfernen und zur�ckliefern.
     * Existiert kein Element, wird eine Exception ausgel�st.
     * @throws QueueEmptyException 
     */
    public T dequeue() throws QueueEmptyException {
        if(counter <= 0)
            throw new QueueEmptyException();
        counter--;

        T element = first.getData();
        first = first.getNext();
    	return element;
    }
    
    
    
    /**
     * �bergebenen Integer am Ende der Queue anh�ngen.
     * @param i Zahl
     */
    public void enqueue(T i) {

        Node<T> newNode = new Node<>(i);
        if (counter == 0)
        {
            first = newNode;
        }
        if(counter == 1)
        {
            last = newNode;
            first.setNext(last);
        }
        if(counter > 1)
        {
            last.setNext(newNode);
            last = newNode;
        }

        counter++;
    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
    	return counter;
    }
}
