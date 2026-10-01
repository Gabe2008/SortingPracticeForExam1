import java.util.Comparator;

public class SortableObjectComparatorByName implements Comparator<SortableObject> {
    @Override
    public int compare(SortableObject lhs, SortableObject rhs) {
        return lhs.getName().compareTo(rhs.getName());
    }
}
