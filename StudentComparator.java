import java.util.Comparator;

public class StudentComparator extends Comparator {
    @Override
    public int compare(Student s1, Student s2) {
        if(Double.compare(s2.getCgpa(), s1.getCgpa()) != 0){
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        int nameCompare = s1.getFname().compareTo(s2.getFname());
        if(nameCompare != 0){
            return nameCompare;
        }

        return Integer.compare(s1.getId(), s2.getId());
    }
}
