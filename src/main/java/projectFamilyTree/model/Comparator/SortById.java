package projectFamilyTree.model.Comparator;

import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.Persons.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortById
{

    public List<Person> sortBy() throws IOException, ClassNotFoundException
    {
        FillHuman fh = new FillHuman();
        List<Person> listPerson = new ArrayList<>();
        listPerson = fh.fillByHuman();
        listPerson.sort(new IdComparator());
        return listPerson;
    }

}
