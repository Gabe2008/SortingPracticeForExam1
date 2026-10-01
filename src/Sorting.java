import java.util.Comparator;

public class Sorting {
    static public void SelectionSort(SortableObject[] arr, Comparator<SortableObject> comp){
        for(int i=0; i<arr.length; i++){
            int minID=i;
            for(int j=i+1; j<arr.length; j++){
                if(comp.compare(arr[j],arr[minID])<0){
                    minID = j;
                }
            }
            SortableObject temp=arr[minID];
            arr[minID]=arr[i];
            arr[i]=temp;
        }
    }

    static public void InsertionSort(SortableObject[] arr, Comparator<SortableObject> comp){
        for(int i =1; i<arr.length; i++){
            SortableObject moving=arr[i];
            for(int j = i-1; j>=0; j--){
                if(comp.compare(moving,arr[j])<0){
                    arr[j+1]=arr[j];
                    arr[j]=moving;
                } else {
                    break;
                }
            }
        }
    }
}
