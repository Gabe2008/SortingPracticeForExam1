import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SortableObject A = new SortableObject("A");
        SortableObject B = new SortableObject("B");
        SortableObject C = new SortableObject("C");
        SortableObject[] arr = new SortableObject[]{C,A,B};

        PrintSortableObjectArray(arr);
        Sorting.InsertionSort(arr, new SortableObjectComparatorByName());
        PrintSortableObjectArray(arr);
    }

    public static void PrintSortableObjectArray(SortableObject[] arr){
        for(SortableObject obj : arr){
            System.out.println(obj);
        }
    }
}