import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SortableObject A = new SortableObject("A",1);
        SortableObject B = new SortableObject("B",1);
        SortableObject C = new SortableObject("C",1);
        SortableObject A2 = new SortableObject("A",2);
        SortableObject B2 = new SortableObject("B",2);
        SortableObject C2 = new SortableObject("C",2);
        SortableObject[] arr = new SortableObject[]{C,A,B,B2,C2,A2};

        PrintSortableObjectArray(arr);
        Sorting.MergeSort(arr, new SortableObjectComparatorByName());
        PrintSortableObjectArray(arr);
    }

    public static void PrintSortableObjectArray(SortableObject[] arr){
        for(SortableObject obj : arr){
            System.out.println(obj);
        }
        System.out.println("");
    }
}