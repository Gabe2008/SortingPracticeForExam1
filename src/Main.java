import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SortableObject A1 = new SortableObject("A",1);
        SortableObject B1 = new SortableObject("B",1);
        SortableObject C1 = new SortableObject("C",1);
        SortableObject A2 = new SortableObject("A",2);
        SortableObject B2 = new SortableObject("B",2);
        SortableObject C2 = new SortableObject("C",2);
        SortableObject A3 = new SortableObject("A",3);
        SortableObject B3 = new SortableObject("B",3);
        SortableObject C3 = new SortableObject("C",3);
        SortableObject[] arr = new SortableObject[]{A1,B1,C1,C1,C3,B3,A1,C2,B2,A2,B1,A3};

        System.out.println("Unsorted:");
        PrintSortableObjectArray(arr);
        Sorting.mergeSort(arr, new SortableObjectComparatorByName());
        System.out.println("Sorted by name:");
        PrintSortableObjectArray(arr);
        System.out.println("Search for B: "+Searching.binarySearchByName(arr,"B",0,arr.length));
    }

    public static void PrintSortableObjectArray(SortableObject[] arr){
        for(SortableObject obj : arr){
            System.out.println(obj);
        }
    }
}