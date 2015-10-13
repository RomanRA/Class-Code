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

// Facilitator class for the List class
class DListNode                     // A doubly linked list node
{
    // Data members
    private Object element;         // List element
    private DListNode prior,        // Reference to the previous element
                      next;         // Reference to the next element

    // Constructor
    DListNode(Object elem, DListNode priorPtr, DListNode nextPtr)
    {        
    	this.element = elem;
    	this.prior = priorPtr;
    	this.next = nextPtr;
    	
    }

    // Class Methods used by client class
    DListNode getNext( )                    // Return reference to next element
    {        
    	
    	return this.next;
    	
    }
    DListNode setNext( DListNode nextVal )  
    // Set reference to next element & return that reference
    {             
    	this.next = nextVal;
    	
    	return this.next;
    }
    DListNode getPrior( )                   // Return reference to prior element
    {       
    	
    	return this.prior;
    	
    }
    DListNode setPrior( DListNode priorVal )    
    // Set reference to prior element & return that reference
    {            
    	this.prior = priorVal;
    	
    	return this.prior;
    }
    Object getElement( )                    // Return the element in the current node
    {         
    	return this.element;
    	
    }
    void setElement(Object elem)          
    // Set value of the element in the current node
    {            
    	
    	this.element = elem;
    	
    }

} // class DListNode
