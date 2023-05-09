package projectFamilyTree.model.Comparator;

import projectFamilyTree.model.FamilyTree.FamilyTree;
import projectFamilyTree.model.Persons.Person;

public class SortByLastName
{
    private FamilyTree familyTree;
        void SortByLastName(FamilyTree familyTree)
        {
            this.familyTree = familyTree;
        }

        public void sortByLastName(FamilyTree familyTree)
        {
            familyTree.sort(new IdComparator()); 
        } 
}
