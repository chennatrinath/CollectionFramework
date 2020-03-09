package epam.collections;
import java.util.Arrays;

public class CustomList<E>{
	    private int size = 0;
	    public static final int listCapacity=10;
	    private Object elements[];
	    public CustomList() {
	        elements = new Object[listCapacity];
	    }
	    public void add(E e) {
	        if (size == elements.length) {
	            ensureCapacity();
	        }
	        elements[size++] = e;
	    }
	    @SuppressWarnings("unchecked")
		public E get(int i) {
	        return (E) elements[i];
	    }
	    @SuppressWarnings("unchecked")
		public E remove(int i) {
	        Object item = elements[i];
	        int length = elements.length - ( i + 1 ) ;
	        System.arraycopy( elements, i + 1, elements, i, length ) ;
	        size--;
	        return (E) item;
	    }
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(elements[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	    private void ensureCapacity() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
	}
