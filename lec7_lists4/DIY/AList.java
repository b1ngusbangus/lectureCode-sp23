package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */
public class AList {
    // whole entire thing will have a size and start off with an empty list
    private int[] items;   // set to private so "no outsider can edit our code" -hug
    private int size;
    
    /** Creates an empty list. */
    public AList() {
        items = new int[1000]
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        items[size] = x;   // size starts at 0 which is = 0th index in empty list --> add x there
        size += 1;   // increase size by 1 and repeat
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];   // length starts at 1, index starts at 0 --> size-1 to get last item since
                                  // we're referring to indices here
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int deletedValue = items[size - 1];
        items[size - 1] = null;
        size -= 1;
        return deletedValue;
    }
} 
