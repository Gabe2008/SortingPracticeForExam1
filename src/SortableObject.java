public class SortableObject
{
    String name;
    int x;

    public SortableObject(String name, int x){
        this.name = name;
        this.x = x;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return name+x;
    }
}
