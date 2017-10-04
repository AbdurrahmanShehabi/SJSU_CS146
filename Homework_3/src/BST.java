import java.util.*;

class UnderflowException extends Exception { };


public class BST<AnyType extends Comparable<? super AnyType>>
{
    private static class BinaryNode<AnyType> {
        BinaryNode( AnyType theElement )
        { this( theElement, null, null, null ); }

        BinaryNode( AnyType theElement,
                    BinaryNode<AnyType> lt, BinaryNode<AnyType> rt,
                    BinaryNode<AnyType> pt )
        { element  =  theElement; left  =  lt; right  =  rt; parent  =  pt; }

        AnyType element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;
        BinaryNode<AnyType> parent;
    }

    public BST()
    { root = null; }

    public void makeEmpty() {
        modCount ++;
        root  =  null;
    }

    public boolean isEmpty()
    { return root  ==  null; }

    public boolean contains( AnyType x )
    { return contains( x, root ); }

    public AnyType findMin() throws UnderflowException {
        if ( isEmpty() )
            throw new UnderflowException();
        else
            return findMin( root ).element;
    }

    public AnyType findMax() throws UnderflowException {
        if ( isEmpty() )
            throw new UnderflowException();
        else
            return findMax( root ).element;
    }

    public void insert( AnyType x )
    { root  =  insert( x, root, null ); }

    public void remove( AnyType x )
    { root  =  remove( x, root ); }

    public void printInOrder() {
        printInOrder(root);
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printInOrder(BinaryNode root) {
        if( root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.element + " ");
        printInOrder(root.right);
    }

    private void printPreOrder(BinaryNode root) {
        if(root == null)
            return;
        System.out.print(root.element + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private void printPostOrder(BinaryNode root) {
        if(root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.element + " ");
    }

    private boolean contains( AnyType x, BinaryNode<AnyType> t ) {
        if( t == null)
            return false;

        int compareResult = x.compareTo(t.element);

        if(compareResult < 0)
            return contains(x, t.left);
        else if(compareResult > 0)
            return contains(x, t.right);
        else
            return true;

    }

    private BinaryNode<AnyType> findMin( BinaryNode<AnyType> t ) {
        if (t == null)
            return null;
        else if(t.left == null)
            return t;
        return findMin(t.left);

    }

    private BinaryNode<AnyType> findMax( BinaryNode<AnyType> t ) {
        if (t != null)
            while(t.right != null)
                t = t.right;
        return t;
    }

    private BinaryNode<AnyType> insert( AnyType x, BinaryNode<AnyType> t, BinaryNode<AnyType> pt ) {
        if ( t == null )
        {
            modCount++ ;
            return new BinaryNode<AnyType>( x, null, null, pt);
        }

        int compareResult  =  x.compareTo( t.element );

        if ( compareResult < 0)
            t.left  =  insert( x, t.left, t );
        else if ( compareResult > 0)
            t.right  =  insert( x, t.right, t );
        else
            ; // duplicate

        return t;
    }

    private BinaryNode<AnyType> remove( AnyType x, BinaryNode<AnyType> t ) {
        if ( t == null )
            return t; // not found

        int compareResult  =  x.compareTo( t.element );

        if ( compareResult < 0)
            t.left  =  remove( x, t.left );
        else if ( compareResult > 0)
            t.right  =  remove( x, t.right );
        else if ( t.left != null && t.right != null ) // two children
        {
            t.element  =  findMin( t.right ).element;
            t.right  =  remove( t.element, t.right );
        }
        else
        {
            modCount++ ;
            BinaryNode<AnyType> oneChild;
            oneChild  =  ( t.left != null ) ? t.left : t.right;
            oneChild.parent  =  t.parent;  // update parent link
            t  =  oneChild;
        }

        return t;
    }

    private BinaryNode<AnyType> root;
    int modCount  =  0;
}

