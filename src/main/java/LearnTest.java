import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnTest implements TestInterface{


    @Override
    public double getAverage() {
        double[] doubleArray = {19,20.2,33.4,40};

        double total = 0;

        for (int i = 0; i <doubleArray.length ; i++) {
            total = total + doubleArray[i];
        }

        double average = total / doubleArray.length;
        System.out.format("The average is: %.3f", average);
        return average;
    }


    @Override
    public int[] findPositions(int val) {
     int[] positions = {10,20,56,60,10};
       int getIndex = Arrays.asList(positions).indexOf(val);
        System.out.println("Index of the array is: " + getIndex);
        return positions;
    }

    @Override
    public double appendLast(int value) {
    int[] numbers = {10,20,30,14,70};
    int newNum = value;
    int[] newArr = new int[numbers.length + 1];
        int i;
        for ( i =0; i < numbers.length; i++) {
            newArr[i] = numbers[i];
        }
    newArr[i] = value;

        for (int j = 0; j < newArr.length; j++) {
            System.out.println(j);
        }

        return 2.2;
    }


    @Override
    public double insertAt(int pos, int value) {
    int[] numbers = {12,30,50,10,200};

        return 2.3;
    }



    @Override
    public int getAt(int pos) {
        List<Integer> numbers = new ArrayList(4);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(pos);
        System.out.println(numbers.indexOf(pos));
        System.out.println(pos);
        return pos;
    }


    @Override
    public double setAt(int pos, int element) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        list.add(30);
        list.add(50);

        int newValue = pos;
        list.indexOf(newValue);

        list.add(newValue);
        System.out.println("We set a new value at position pos " + newValue);

        return 5.7;
    }

    @Override
    public int deleteAt(int pos) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println("Before removed " + list);
        list.remove(pos);
        int index = pos;
        System.out.println("Removed " + index);
        System.out.println(list);
        return 0;
    }


}
