package projectFamilyTree.model.Comparator;

import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.FamilyTree.FamilyTree;
import projectFamilyTree.model.Persons.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortByLastName
{

        public List<Person> sortByLastName() throws IOException, ClassNotFoundException {
            FillHuman fh1 = new FillHuman();
            List<Person> listPerson = new ArrayList<>();
            listPerson = fh1.fillByHuman();
            listPerson.sort(new NameComparator<>());
            return listPerson;
        }
}
