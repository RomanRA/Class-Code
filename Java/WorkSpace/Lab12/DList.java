import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

//--------------------------------------------------------------------
//
// 
//  Class definitions for the circular, doubly linked list
//  implementation of the List ADT
//
//  The student is to complete all missing or incomplete method 
//     implementations for each class
//
//--------------------------------------------------------------------


class DList implements List     //Circular, doubly linked list implementation of the
                                //            List ADT
{
    // Data members
    private DListNode head,      // Reference to the beginning of the list
                     cursor;    // Reference to current cursor position
    
    // Constructors & Helper Method
    public DList( )             // Default constructor: Creates an empty list
    {        
    	
    	this.head = null;
    	
    	this.cursor = this.head;
    	
    }
    public DList( int size )    // Constructor: Creates an empty list, size is ignored
    {            
    	
    	this.head = null;
    	this.cursor = null;
    	
    }
    
    // Class methods
    private void setup( )
    // Called by constructors only: Creates an empty list
    {       
    	
    	this.head = null;
    	this.cursor = null;
    }
    
    //----- Insert method definitions for the interface List here -----//   
    public void insert(Object newElement){

    	//1. create a DListNode with the newElement
    	DListNode temp = new DListNode(newElement, null, null);
    	
    	
    	//2.empty list case, set the head and cursor to the new DlistNode form 1.
    	if(this.isEmpty()){
    			this.head = temp;
    			this.cursor = temp;
    			
    			return;
    	}

    	
    	
    	//3.
    	DListNode tempNext = cursor.getNext();
    	
    	if(tempNext == null){
    		
    	}
    	else{
    		tempNext.setPrior(temp);
    		temp.setNext(tempNext);
    	}
    	
    	temp.setPrior(cursor);
    	cursor.setNext(temp);
    	
    	cursor = temp;
    	
    	
	}
    // Inserts newElement after the cursor. If the list is empty, then
    // newElement is inserted as the first (and only) element in the list.
    // In either case, moves the cursor to newElement.

    public void remove( ){
    	//removing form begginning
     
    	DListNode p;   // Iterates through the list

		if(cursor == head)
		{
			p = head;
			head = head.getNext();
			cursor = head;
		}
    	
       //removing form the middle
       if(cursor.getNext()!= null){
    	 //need to bypass node
    	   //move head to prior
    	   //cursor = head.getPrior()
    	   
       }
       
       else{
    	   
       }
       
       //remove from the end
        
           
     

        
    }
    // Removes the element marked by the cursor from a list. Moves the
    // cursor to the next element in the list. Assumes that the first list
    // element "follows" the last list element.

    public void replace (Object newElement){
    	
    }
    // Replaces the element marked by the cursor with newElement and
    // leaves the cursor at newElement.

    public void clear( ){
    	this.setup();
   
    // Removes all elements in a list
    }
    public boolean isEmpty( ){
    	
    	if(this.head != null){
    		return false;
    	}
    	return true;
    }
    // Returns true if list is empty, else returns false

    public boolean isFull( ){
    
    	
    	return false;
    }
    // Returns true if list is full, else returns false
    // Always returns false because Java automatically 
    //  generates an OutOfMemory error otherwise.

    public boolean gotoBeginning( ){
    	
    	if(this.isEmpty()){
    		return false;
    	}
    	
    	this.cursor = this.head;
    	
    	return true;
    }
    // If list not empty, moves cursor to beginning of list & returns true, else returns false

    public boolean gotoEnd( ){
    	
    	if(this.isEmpty()){
    		return false;
    	}
    	
    	//move cursor to the last element of the list
    	
    	
    	return true;
    }
    // If list not empty, moves cursor toend of list & returns true,else returns false

    public boolean gotoNext( ){
    	
    	if(cursor.getNext() == null){
    		return false;
    	}
    	
    	cursor = cursor.getNext();
    	
    	return true;
    }
    // If cursor not at end of list, moves cursor to next element in list & returns true
    //  else returns false  

    public boolean gotoPrior( ){
    	
    	if(cursor == head){
    		return false;
    	}
    	
    	cursor = cursor.getPrior();
    	
    	return true;
    }
    // If cursor not at beginning of list, moves cursor to preceding element 
    //   in list & returns true, else returns false 

    public Object getCursor( ){
    	
    	
    	if(cursor == null){
    		return null;
    	}
    	
    	return cursor.getElement();
    	
    	
    }
    // Returns the element at the cursor

 
    // Outputs the elements in a list. If the list is empty, outputs
    // "Empty list". This operation is intended for testing and
    // debugging purposes only.
    
    
    
    
    
    
    
    
    public void showStructure ( ) 
    // Outputs the elements in a list. If the list is empty, outputs
    // "Empty list". This operation is intended for testing and
    // debugging purposes only.
    {
        DListNode p;   // Iterates through the list

        if ( head == null )
            System.out.println("Empty list");
        else
        {
            p = head;
            do
            {
                if ( p == cursor )
                    System.out.print("[" + p.getElement( ) + "] ");
                else
                    System.out.print(p.getElement( ) + " ");
                p = p.getNext( );
            } while ( p != null );
            System.out.println( );
        }
    }

    // In-lab opertions -- not declared in interface List
    public void reverse ( )
    // Reverses the order of the elements in a list. The cursor does
    // not move. 
    {               }

} // class DList
