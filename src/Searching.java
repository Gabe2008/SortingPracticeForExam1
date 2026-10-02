public class Searching {
    public static int linearSearchByName(SortableObject[] arr,String name){
        for(int i = 0;i<arr.length;i++){
            if(arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchByX(SortableObject[] arr,int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i].getX()==x){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchByName(SortableObject[] arr,String name, int low, int high){
        if (low > high) {
            return -1;
        }
        int mp = (low+high)/2;
        if(name.compareTo(arr[mp].getName())<0){
            return binarySearchByName(arr,name,low,mp-1);
        } else if (name.compareTo(arr[mp].getName())>0){
            return binarySearchByName(arr,name,mp+1,high);
        } else {
            return mp;
        }
    }
}
