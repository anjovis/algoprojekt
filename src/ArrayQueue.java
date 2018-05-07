import org.omg.CORBA.portable.UnknownException;

// ArrayQueue class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void enqueue( x )      --> Insert x
// AnyType getFront( )    --> Return least recently inserted item
// AnyType dequeue( )     --> Return and remove least recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// getFront or dequeue on empty queue

/**
 * Array-based implementation of the queue.
 
*/
public class ArrayQueue <AnyType>
{
    private AnyType [ ] theArray;
    private int         currentSize;
    private int         front;
    private int         back;

    private static final int DEFAULT_CAPACITY = 10;

	 
	 
	 /**
     * Construct the queue.
     */
    public ArrayQueue( )
    {
        theArray = (AnyType []) new Object[ DEFAULT_CAPACITY ];
        makeEmpty( );
    }

    /**
     * Test if the queue is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( )
    {
        return currentSize == 0;
    }

    /**
     * Make the queue logically empty.
     */
    public void makeEmpty( )
    {
        currentSize = 0;
        front = 0;
        back = -1;
    }


    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     */
    public void enqueue( AnyType x )
    {
        if( currentSize == theArray.length )
            doubleQueue( );
        back = increment( back );
        theArray[ back ] = x;
        currentSize++;
    }


  
    /**
     * Return and remove the least recently inserted item
     * from the queue.
     * @return the least recently inserted item in the queue.
     * @throws Exception 
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType dequeue( ) throws Exception
    {
        if( isEmpty( ) )
            throw new Exception( "ArrayQueue dequeue" );
        currentSize--;

        AnyType returnValue = theArray[ front ];
        front = increment( front );
        return returnValue;
    }
    
    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     * @return the least recently inserted item in the queue.
     * @throws Exception 
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType getFront( ) throws Exception
    {
        if( isEmpty( ) )
            throw new Exception( "ArrayQueue getFront" );
        return theArray[ front ];
    }

        /**
     * Internal method to increment with wraparound.
     * @param x any index in theArray's range.
     * @return x+1, or 0 if x is at the end of theArray.
     */
    private int increment( int x )
    {
        if( ++x == theArray.length )
            x = 0;
        return x;
    }
    
    /**
     * Internal method to expand theArray.
     */
    private void doubleQueue( )
    {
        AnyType [ ] newArray;

        newArray = (AnyType []) new Object[ theArray.length * 2 ];

            // Copy elements that are logically in the queue
        for( int i = 0; i < currentSize; i++, front = increment( front ) )
            newArray[ i ] = theArray[ front ];

        theArray = newArray;
        front = 0;
        back = currentSize - 1;
    }

    

public static void main (String [] arg) throws Exception
	{
	   ArrayQueue <String> q =new ArrayQueue<String>();
		
		try{
		
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		


		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
	   
		/*s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
     */

		
		}
		catch( UnknownException e)
		{
		  System.out.println(e);
		  System.out.println("K� empty");
		  
		}
	
	}

  }  	 