

class SinglyLinkedList
{ 

    public static void main(String args[]) 
    { 
        System.out.println("SinglyLinkedList"); 

	ListElement<String> head;

	ListElement<String> item1 = new ListElement<String>("Item1");
	System.out.println( item1.getValue() ); 
	System.out.println( item1.getNext() ); 

	head = item1;

	item1.insertInFront( item1, "newItem" );


	System.out.println( item1 ); 
    }

}


class ListElement<T>
{
	/* Private class variables */
	
	/* contains pointer (reference) to next element (null is non) */
	private ListElement<T> next;

	/* contains element value */
	private T data;


	/* Constructor */
	public ListElement( T value )
	{
		data = value;
	}


	/* get next element */
	public ListElement<T> getNext()
	{return next;}	

	/* get element value */
	public T getValue()
	{return data;}

	
	/* set next element */
	public void setNext( ListElement<T> elem )
	{
		next = elem;
	}
	
	/* set element value */
	public void setValue( T value )
	{
		data = value;
	}


	/**
	 * insert in front 
 	 *  Given elem,value
	 *  results in  [newele,value] -> [elem, ]
	 *  This function is data type generic.
	 *
	 */
	public ListElement<T> insertInFront( ListElement<T> elem, T value )
	{
		ListElement<T> newItem = new ListElement<T>(value);
		newItem.setNext(elem);
		return newItem; //to update head if needed.
	}


	/**
	 * toString for the linked list
	 *
	 */
	public String toString()
	{
		String out = "";

		out+="toString()";
		out+=" value:"+this.getValue();

		return out;
	}

}
