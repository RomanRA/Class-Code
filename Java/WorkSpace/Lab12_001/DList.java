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
    {               }
    public DList( int size )    // Constructor: Creates an empty list, size is ignored
    {               }
    
    // Class methods
    private void setup( )
    // Called by constructors only: Creates an empty list
    {               }
    
    //----- Insert method definitions for the interface List here -----//   
    
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
            } while ( p != head );
            System.out.println( );
        }
    }

    // In-lab opertions -- not declared in interface List
    public void reverse ( )
    // Reverses the order of the elements in a list. The cursor does
    // not move. 
    {               }

} // class DList
