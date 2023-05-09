package projectFamilyTree.model.Comparator;

import projectFamilyTree.model.FamilyTree.FamilyTree;

public class SortById 
{
    private FamilyTree familyTree;

   public void SortById(FamilyTree familyTree)
    {
        this.familyTree = familyTree;
    }

    public void sortBy(FamilyTree familyTree)
    {
        familyTree.sort(new IdComparator());
    }
}
