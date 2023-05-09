package projectFamilyTree.model.Comparator;

import java.util.Comparator;

import projectFamilyTree.model.Persons.Human;
import projectFamilyTree.model.Persons.Person;

public class IdComparator<T extends Person> implements Comparator<T>
{
        @Override
        public int compare(T member2, T member1) 
        {
            if (member1 instanceof Human && member2 instanceof Human)

           {
            return Integer.compare(member1.getId(), member2.getId());
           }
           return 1;
        }
    }