package projectFamilyTree.view;
import java.io.IOException;

import projectFamilyTree.model.FamilyTree.FamilyTree;
import projectFamilyTree.presenter.Presenter;

public interface View<T, E> 
{
    void StartProgram() throws ClassNotFoundException, IOException;
    void printPersons(E e, int x);
    void print(String text);
    void setPresenter(Presenter presenter);
    
}
