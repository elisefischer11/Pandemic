import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * BSTNode.java is a class to represent a node in a binary search tree it it contains a data value,a
 * reference to its parent node and 2 ref for it children
 * 
 * generic data type T
 * 
 */

public class BSTNode<T> {
  // protected data tapes an be accessdd by subclasses and by classes within the same package

  // stores data of generic type T
  protected T data;
  // reference to parent BSTNode
  protected BSTNode<T> parent;
  // ref to left child
  protected BSTNode<T> left;
  // ref to right child
  protected BSTNode<T> right;

  /**
   * constructor constructs new node with given data initial parent and child refs are null
   * 
   * @param data
   */
  public BSTNode(T data) {
    this.data = data;
  }

  // functions to set/get references to surronding nods + data of this BSTnode

  /**
   * @return data value of this bstnode
   */
  public T getData() {
    return this.data;
  }

  /**
   * @return parent node of this bstnode
   */
  public BSTNode<T> getParent() {
    return this.parent;
  }

  /**
   * @return child right node of this bstnode
   */
  public BSTNode<T> getRight() {
    return this.right;
  }

  /**
   * @return child left node of this bstnode
   */
  public BSTNode<T> getLeft() {
    return this.left;
  }

  // functions to set node references for this node, all public with no ret values

  /**
   * Sets new parent ref
   * 
   * @param newParent the new parent
   */
  public void setParent(BSTNode<T> newParent) {
    this.parent = newParent;
  }

  /**
   * Sets new right ref
   * 
   * @param newRight the new right child for this node
   */
  public void setRight(BSTNode<T> newRight) {
    this.right = newRight;
  }

  /**
   * Sets new left ref
   * 
   * @param newLeft the new left child for this node
   */
  public void setLeft(BSTNode<T> newLeft) {
    this.left = newLeft;
  }

  /**
   * Sets new data vaue for BST Node
   * 
   * @param newData the new data value
   */
  public void setData(T newData) {
    this.data = newData;
  }

  /**
   * @return true if this node is a right child of its parent, false otherwise
   */
  public boolean isRightChild() {
    return this.getParent() != null && this.getParent().getRight() == this;
  }

  /**
   * @return true if this node is a left child of its parent, false otherwise
   */
  public boolean isLeftChild() {
    return this.getParent() != null && this.getParent().getLeft() == this;
  }

  /**
   * @return this nodes data in String form
   */
  public String toString() {
    return this.getData().toString();
  }

  /**
   *  goes through subtree rooted at this node in level order 
   * @return string of level order traversal starting at this node as the root
   */
  public String levelOrderString() {
    Queue<BSTNode<T>> nodes = new LinkedList<>();
    StringBuffer str=new StringBuffer();
    str.append("[ ");
    nodes.add(this);
    
    while(!nodes.isEmpty()) {
      if(nodes.peek().getLeft()!= null) {
        nodes.add(nodes.peek().getRight());
      }
    }
    
    
    
    //rm final  node form queue 
    str.append(" ]");
    return str.toString();
  }
  /**
   * in order tranversal of tree rooted at this node and retruns a string 
   * @return string representation tree at this node in order
   */
  public String orderString() {
    //left until you can go left anymore, add to string, go up one node, go right, go left until you cant go left anymore
    
    return ""
    
  }
}


