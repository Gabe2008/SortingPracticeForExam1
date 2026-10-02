import java.util.Comparator;

public class SortableObjectComparatorByX implements Comparator<SortableObject> {
    @Override
    public int compare(SortableObject lhs, SortableObject rhs) {
        return lhs.x-rhs.x;
    }
}
