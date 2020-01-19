/*
Generics

*/

import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;

class GenericArrayPrinter
{
	/* Constructor */
	GenericArrayPrinter()
	{}


	/* Generic method printArray
		This method take multiple types of array input, 
		ie Int, Double, Char, 
		and performs an action with the same code, for each type.
	*/
	public static <E> void printArray( E[] inputArray )
	{
		// Display array elements
		for(E element : inputArray){
			 System.out.printf("%s ", element);
		}
		System.out.println();
	}



	public static <T extends Integer> void printArrayType(T[] inputArray)
	{
		//because extends Iterable type, we can iterate
		for(T element : inputArray){
			 System.out.printf("%s ", element);
		}
		System.out.println();
		
	}

}



/*
Box class created using Generics
to accept any type of object into the box.

class Box<T extends Integer>{ 
would restrict to Integer type.
*/
class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }
}



public class GenericsDemo {

   public static void main(String args[])
   {

	/*
	This example show basic Generics usage.
	*/


	GenericArrayPrinter gap = new GenericArrayPrinter();

	// Create arrays of Integer, Double and Character
	Integer[] intArray = { 1, 2, 3, 4, 5 };
	Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	System.out.println("Array integerArray contains:");
	gap.printArray(intArray);   // pass an Integer array

	System.out.println("\nArray doubleArray contains:");
	gap.printArray(doubleArray);   // pass a Double array

	System.out.println("\nArray characterArray contains:");
	gap.printArray(charArray);   // pass a Character array


	/*
	This example shows bounded generic types.
	ie, 
	restrict the kinds of types that are allowed to be passed to a type parameter.

	in the case below, restrics to Interger
	*/
	gap.printArrayType(intArray);
	//gap.printArrayType(doubleArray);
	//gap.printArrayType(charArray);


	/*
	Box class created using Generics
	to accept any type of object into the box.
	*/
	Box<Integer> integerBox = new Box<Integer>();
	Box<String> stringBox = new Box<String>();

	integerBox.add(new Integer(10));
	stringBox.add(new String("Hello World"));

	System.out.println();
	System.out.println("Integer Value "+ integerBox.get());
	System.out.println("String Value "+ stringBox.get());	
	
   }
}
