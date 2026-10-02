import java.util.Comparator;

public class Sorting {
    static public void selectionSort(SortableObject[] arr, Comparator<SortableObject> comp){
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

    static public void insertionSort(SortableObject[] arr, Comparator<SortableObject> comp){
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

    static public void mergeSort(SortableObject[] arr, Comparator<SortableObject> comp){
        int mid=arr.length/2;
        SortableObject[] left=new SortableObject[mid];
        SortableObject[] right=new SortableObject[arr.length-mid];
        for(int i=0;i<left.length;i++){
            left[i]=arr[i];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[i+mid];
        }

        if(left.length>1){
            mergeSort(left,comp);
        }
        if(right.length>1){
            mergeSort(right,comp);
        }

        int i = 0;
        int j = 0;
        while(i+j<arr.length && i<left.length && j<right.length){
            if(comp.compare(left[i],right[j])<=0){
                arr[i+j]=left[i];
                i++;
            } else {
                arr[i+j]=right[j];
                j++;
            }
        }
        while(i<left.length){
            arr[i+j]=left[i];
            i++;
        }
        while(j<right.length){
            arr[i+j]=right[j];
            j++;
        }
    }

    static public void quickSort(SortableObject[] arr, int low, int high, Comparator<SortableObject> comp){
        int pivotV = (low+high)/2;
        SortableObject pivot=arr[pivotV];

        for(int i =0; i<arr.length; i++){
            if(comp.compare(pivot,arr[i])<=0){

            }
        }
    }
}
