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
    {               }

    // Class Methods used by client class
    DListNode getNext( )                    // Return reference to next element
    {               }
    DListNode setNext( DListNode nextVal )  
    // Set reference to next element & return that reference
    {               }
    DListNode getPrior( )                   // Return reference to prior element
    {               }
    DListNode setPrior( DListNode priorVal )    
    // Set reference to prior element & return that reference
    {               }
    Object getElement( )                    // Return the element in the current node
    {               }
    void setElement(Object elem)          
    // Set value of the element in the current node
    {               }

} // class DListNode
