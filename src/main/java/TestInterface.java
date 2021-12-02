/**
 * Interface for handling an array of integers.
 */
public interface TestInterface {

    /**
     * Get the average value of the entire array.
     * @return Average.
     */
    double getAverage();
    /**
     * Find and return all positions where an element's value is <val>.
     * @param val Value to find positions for.
     * @return Positions.
     */
    int[] findPositions(int val);
    /**
     * Append a value after the last element.
     //* @param element
     * @return
     */
    double appendLast(int value);
    /**
     * Insert a value at position <pos>.
     * @param pos
     * @param value
     * @return
     */
    double insertAt(int pos, int value);
    /**
     * Get value at position <pos>.
     * @param pos
     * @return value.
     */
    int getAt(int pos);
    /**
     * Set a new value at position <pos>.
     * @param pos
     * @param element
     * @return
     */
    double setAt(int pos, int element);
    /**
     * Delete element at position <pos>.
     * Return the deleted element's value.
     * @param pos
     * @return
     */
    int deleteAt(int pos);
}
