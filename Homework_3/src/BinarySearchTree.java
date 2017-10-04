import java.util.Comparator;
import java.lang.Exception;

public class BinarySearchTree<T extends Comparable<T>> {
    private static class BinaryNode<T>{
        BinaryNode(T theElement){
            this( theElement, null, null);
        }
        BinaryNode(T theElement, BinaryNode<T> leftTree, BinaryNode<T> rightTree){
            element = theElement;
            left = leftTree;
            right = rightTree;
        }

        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;
    }

    private BinaryNode<T> root;
    private Comparator<? super T> cmp;

    public BinarySearchTree(){
        root = null;
    }

    public void makeEmpty( ){
        root = null;
    }
    public boolean isEmpty( ){
        return root == null;
    }
    public boolean contains( T x ){
        return contains( x, root );
    }

    public T findMin(){
        try {
            if (isEmpty())
                throw new Exception();
        }
        catch (Exception e) {
        }
        return findMin( root ).element;
    }
    public T findMax( ){
        try {
            if (isEmpty())
                throw new Exception();
        }
        catch (Exception e) {
        }
        return findMax( root ).element;
    }

    public void insert( T x ){
        root = insert( x, root );
    }
    public void remove( T x ){
        root = remove( x, root );
    }

    public BinarySearchTree( Comparator<? super T> c){
        root = null;
        cmp = c;
    }
    public int myCompare( T lhs, T rhs ){
        if( cmp != null )
            return cmp.compare( lhs, rhs );
        else
        return ((Comparable)lhs).compareTo( rhs );
    }

    public boolean contains(T x, BinaryNode<T> t ){
        if( t == null )
            return false;
        int compareResult = myCompare( x, t.element );
        if( compareResult < 0 )
            return contains( x, t.left );
        else if( compareResult > 0 )
            return contains( x, t.right );
        else
            return true;
    }

    public BinaryNode<T> findMin( BinaryNode<T> t ){
        if( t == null )
            return null;
        else if( t.left == null )
            return t;
        return findMin( t.left );
    }
    public BinaryNode<T> findMax( BinaryNode<T> t ){
        if( t != null )
            while( t.right != null )
                t = t.right;
        return t;
    }
    public BinaryNode<T> insert(T x, BinaryNode<T> t ){
        if( t == null )
            return new BinaryNode<>( x, null, null );
        int compareResult = x.compareTo( t.element );
        if( compareResult < 0 )
            t.left = insert( x, t.left );
        else if( compareResult > 0 )
            t.right = insert( x, t.right );
        else
            ; // Duplicate; do nothing
        return t;
    }
    public BinaryNode<T> remove( T x, BinaryNode<T> t ){
        if( t == null )
            return t; // Item not found; do nothing
        int compareResult = x.compareTo( t.element );
        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) // Two children
            {
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
            }
        else
        t = ( t.left != null ) ? t.left : t.right;
        return t;
    }

    public void printInOrder(BinaryNode root){
        if( root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.element);
        printInOrder(root.right);
    }

    public void printPreOrder(BinaryNode root){
        if(root == null)
            return;
        System.out.print(root.element);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public void printPostOrder(BinaryNode root){
        if(root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.element);
    }

    public int compareTo(T other) {
        if(this.compareTo(other) > 0)
            return 1;
        else if(this.compareTo(other) == 0)
            return 0;
        else
            return -1;
    }

}
