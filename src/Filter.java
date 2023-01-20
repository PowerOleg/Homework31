import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected List<Integer> arrayList;
    protected int filterNumber;
    public Filter(int filterNumber) {
        this.filterNumber = filterNumber;
    }
    public List<Integer> filterOut(List<Integer> list) {
        return list.stream().filter(n -> n < filterNumber).collect(Collectors.toList());
    }
}
