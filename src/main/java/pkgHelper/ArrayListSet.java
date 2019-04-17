package pkgHelper;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/**
 * Combines the functionality of an ArrayList with
 * the Set methods of HashSet.
 * 
 * @author jvillemarette
 *
 * @param <E>
 */
public class ArrayListSet<E> 
	extends AbstractSet<E> 
	implements List<E>, RandomAccess, Cloneable, java.io.Serializable {
	
	private transient ArrayList<E> elementData;
	
	public ArrayListSet() {
		super();
		
		this.elementData = new ArrayList<>();
	}
	
	public ArrayListSet(Collection<? extends E> c) {
		super();
		
		this.elementData = new ArrayList<>(Math.max((int) (c.size()/.75f) + 1, 16));
        addAll(c);
    }
	
	public ArrayListSet(int initialCapacity) {
		super();
		
		this.elementData = new ArrayList<>(initialCapacity);
    }
	
	/**
	 * For serialization.
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean addAll(Collection<? extends E> c){
		return super.addAll(c);
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		return super.retainAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return super.addAll(c);
	}

	@Override
	public E get(int index) {
		return this.elementData.get(index);
	}

	@Override
	public E set(int index, E element) {
		return this.elementData.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		this.elementData.add(index, element);
		
	}

	@Override
	public E remove(int index) {
		return this.elementData.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return this.elementData.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return this.elementData.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return this.elementData.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return this.elementData.listIterator(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return this.elementData.subList(fromIndex, toIndex);
	}

	@Override
	public Iterator<E> iterator() {
		return this.elementData.iterator();
	}

	@Override
	public int size() {
		return this.elementData.size();
	}

	@Override
	public Spliterator<E> spliterator() {
		return List.super.spliterator();
	}

}
