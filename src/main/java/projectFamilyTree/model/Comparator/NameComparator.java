package projectFamilyTree.model.Comparator;

import java.util.Comparator;
import projectFamilyTree.model.Persons.Human;
import projectFamilyTree.model.Persons.Person;

public class NameComparator<T extends Person> implements Comparator<T> 
{
        @Override
        public int compare(Person member1, Person member2) 
        {
            if (member1 instanceof Human && member2 instanceof Human)
            {
                return member1.getLastName().compareTo(member2.getLastName()) &
                         member1.getFirstName().compareTo((member2.getFirstName()));
            }
        return 1;
        }

}