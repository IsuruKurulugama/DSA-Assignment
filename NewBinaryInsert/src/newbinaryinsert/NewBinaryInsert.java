/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewBinaryInsert;

/**
 *
 * @author IsuKay
 */
public class NewBinaryInsert{
               NewBinaryInsert.Node root;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         NewBinaryInsert theTree = new NewBinaryInsert();
              System.out.println("Search for 20");
               System.out.println(theTree.findNode(20));
            
               
               
    }
    
     class Node
 
 {
  int key;
  String name;
  
  NewBinaryInsert.Node LeftChild;
  NewBinaryInsert.Node RightChild;
  
  // Create Constructor For assign values
  Node(int key , String name)
  {
   this.key=key;
   this.name = name;
   
   
   
  }
  
  public String toString()
  {
   return name + " book price is  " + key;
     
  }
  
  }
    
    public NewBinaryInsert.Node findNode(int key)
 {
  
  NewBinaryInsert.Node focusNode = root;
  
  while(focusNode.key != key)
  {
   if(key < focusNode.key)
   {
    
    focusNode = focusNode.LeftChild;
    
   }
   else
   {
    focusNode = focusNode.RightChild;
    
    
   }
   
   if(focusNode == null)
   {
    return null;
   }
  }
                   return null;
}
}