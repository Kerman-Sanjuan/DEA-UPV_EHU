package listasSimples;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {

	// Atributuak
	protected Node<T> first; // lehenengoaren erreferentzia
	protected String deskr;  // deskribapena
	protected int count; // Cuantos hay ?¿

	public DoubleLinkedList() {
		first = null;
		deskr = "";
		count = 0;
	}
	
	public void setDeskr(String ize) {
	  deskr = ize;
	}

	public String getDeskr() {
	  return deskr;
	}

	public  T removeFirst() { 
	// listako lehen elementua kendu da
	// Aurrebaldintza: zerrenda ez da hutsa
		// KODEA OSATU ETA KOSTUA KALKULATU o(1)
		Node<T> aux = this.first;
		this.first = this.first.next;
		return aux.data; 
	}

	public T removeLast() { 
	// listako azken elementua kendu da
	// Aurrebaldintza: zerrenda ez da hutsa
		// KODEA OSATU ETA KOSTUA KALKULATU = o(1)
		T aux = this.last();
		this.first.prev = null;	
		return aux;
    }


	public T remove(T elem) {
		
	// Aurrebaldintza: zerrenda ez da hutsa
	// Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. Kendutako objektuaren erreferentzia 
        //  bueltatuko du (null ez baldin badago)
		
	
		// KODEA OSATU ETA KOSTUA KALKULATU kostua 0(n)
		
		
        };

	public T first() {
	// listako lehen elementua ematen du
	      if (isEmpty())
	          return null;
	      else return first.data;
	}

	public T last() {
	// listako azken elementua ematen du
	      if (isEmpty())
	          return null;
	      else return first.prev.data;
	}

	public boolean contains(T elem) {
		Node<T> aux = this.first;
		int kont = 0;
	// Egiazkoa bueltatuko du aurkituz gero, eta false bestela
		      if (isEmpty())
		          return false;
		      else {
		    	 while(kont <= this.count) { //No se si esto funciona de esta manera.
		    		 if(aux.data.equals(elem)) {
		    			 return true;
		    		 }
		    		 aux=aux.next;
		    	 }
		    	 return false;
		    	  
		      }
		     
		      // KODEA OSATU ETA KOSTUA KALKULATU o(n)
		   }

	public T find(T elem) {
	// Elementua bueltatuko du aurkituz gero, eta null bestela

		// KODEA OSATU ETA KOSTUA KALKULATU
		Node<T> aux = this.first;
		int kont = 0;
		 if (isEmpty())
	          return null;
	      else {
	    	 while(kont <= this.count) { //No se si esto funciona de esta manera.
	    		 if(aux.data.equals(elem)) {
	    			 return aux.data;
	    		 }
	    		 aux=aux.next;
	    	 }
	    	 return null;
	    	  
	      }
	     
	      // KODEA OSATU ETA KOSTUA KALKULATU o(n)
	   }
	
	public boolean isEmpty() 
	{ return first == null;};
	
	public int size() 
	{ return count;};
	
	/** Return an iterator to the stack that iterates through the items . */ 
	   public Iterator<T> iterator() { return new ListIterator(); } 

	   // an iterator, doesn't implement remove() since it's optional 
	   private class ListIterator implements Iterator<T> { 
		   
		// KODEA OSATU 
	   } // private class
		
		
		public void adabegiakInprimatu() {
			System.out.println(this.toString());
		}

		
		@Override
		public String toString() {
			String result = new String();
			Iterator<T> it = iterator();
			while (it.hasNext()) {
				T elem = it.next();
				result = result + "[" + elem.toString() + "] \n";
			}	
			return "SimpleLinkedList " + result + "]";
		}

}
