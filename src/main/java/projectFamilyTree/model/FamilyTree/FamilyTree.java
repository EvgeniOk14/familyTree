package projectFamilyTree.model.FamilyTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import projectFamilyTree.model.Comparator.IdComparator;
import projectFamilyTree.model.Iterator.HumanIterator;
import projectFamilyTree.model.Persons.Person;

public class FamilyTree<T extends Person> implements Serializable, Iterable<T> {
    private List<T> t;
    private List<T> familyTree = new ArrayList<>();


    @Override
    public String toString() {
        return familyTree.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new HumanIterator(t);
    }

    public void add(T person) {
        familyTree.add(person);
    }


    public int size() {
        return familyTree.size();
    }

    public Object get(int i) {
        return familyTree.get(i);
    }

    public Object getLastName() {
        return getLastName();
    }

    public Object getFirstName() {
        return getFirstName();
    }


}

//    public List<Person> sort(IdComparator idComparator)
//    {
//        return (List<Person>) t;
//    }
//}
