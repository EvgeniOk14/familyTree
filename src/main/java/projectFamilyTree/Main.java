package projectFamilyTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import projectFamilyTree.model.Persons.Person;
import projectFamilyTree.model.Service;
import projectFamilyTree.model.Comparator.SortByLastName;
import projectFamilyTree.model.FamilyTree.FamilyTree;
import projectFamilyTree.model.FamilyTree.FindHuman;
import projectFamilyTree.model.FamilyTree.AddIntoTree.AddPerson;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillOthers;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveBinFormat;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveDocFormat;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveMdFormat;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveTextFormat;
import projectFamilyTree.model.Comparator.SortById;
import projectFamilyTree.presenter.Presenter;
import projectFamilyTree.view.Starts.Console;
import projectFamilyTree.view.View;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException, IOException {



        View view = new Console();

        FillHuman fillHuman = new FillHuman();
        FillOthers fillOthers = new FillOthers();
        FamilyTree familyTree = new FamilyTree();
        SaveBinFormat saveBinFormat = new SaveBinFormat();
        SaveTextFormat saveTextFormat = new SaveTextFormat();
        SaveDocFormat saveDocFormat = new SaveDocFormat();
        SaveMdFormat saveMdFormat = new SaveMdFormat();
        SortByLastName sortByLastName = new SortByLastName();
        FindHuman findHuman = new FindHuman();
        AddPerson addPerson = new AddPerson();
        SortById sortById = new SortById();

        Service service = new Service(familyTree, fillHuman, fillOthers, saveBinFormat,
                saveTextFormat, saveDocFormat, saveMdFormat, sortById, sortByLastName,
                findHuman, addPerson);

        Presenter presenter = new Presenter(view, service);


        view.StartProgram();
    }
}







