package customList;

import java.util.Arrays;

public class CustomList<T> {

	private int size=0;
	private static final int DEFAULT_CAPACITY = 10;
	
	//Important: This array will store all elements added to list
	private Object elements[];

	public CustomList(int capacity) {
		super();
		elements = new Object[capacity];
	}

	public CustomList() {

		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public int size() {
		return size;
	}
	
	
	public int getCapacity() {
		return elements.length;
	}
	
	public void add(T data) {
		if (size == elements.length) {
			int newSize = elements.length * 2;
			//Changes arrays size
	        elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = data;
	}
	
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (T) elements[index];
	}
	
	@SuppressWarnings("unchecked")
	public T remove(int index) {
		if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
		Object item = elements[index];
        int numberElements = elements.length - ( index + 1 ) ;
        System.arraycopy( elements, index + 1, elements, index, numberElements ) ;
        size--;
        return (T) item;
	}
	
	public void set(int index, T data) {
		if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
		remove(index);
		elements[index] = data;
		
		
	}
	public String toString() {
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
	
	
	
	
	
	
	
	
	

}
