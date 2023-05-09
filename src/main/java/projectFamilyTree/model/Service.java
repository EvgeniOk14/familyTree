package projectFamilyTree.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import projectFamilyTree.model.Comparator.IdComparator;
import projectFamilyTree.model.Comparator.NameComparator;
import projectFamilyTree.model.Comparator.SortByLastName;
import projectFamilyTree.model.Comparator.SortById;
import projectFamilyTree.model.FamilyTree.FamilyTree;
import projectFamilyTree.model.FamilyTree.FindHuman;
import projectFamilyTree.model.FamilyTree.AddIntoTree.AddPerson;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillOthers;
import projectFamilyTree.model.Iterator.HumanIterator;
import projectFamilyTree.model.Persons.Human;
import projectFamilyTree.model.Persons.Others;
import projectFamilyTree.model.Persons.Person;
import projectFamilyTree.model.fileWork.Format.SaveDoc.InterfaceSave;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveBinFormat;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveDocFormat;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveMdFormat;
import projectFamilyTree.model.fileWork.Format.SaveDoc.SaveTextFormat;
import projectFamilyTree.model.fileWork.Format.ReadDoc.ReadBin;
import projectFamilyTree.model.fileWork.Format.ReadDoc.ReadDoc;
import projectFamilyTree.model.fileWork.Format.ReadDoc.ReadTxt;
import projectFamilyTree.model.fileWork.Format.ReadDoc.ReadMd;
import projectFamilyTree.model.fileWork.Format.ReadDoc.interfaceRead;


public class Service<T extends Person>
{
    private FillHuman fillHuman;
    private FillOthers fillOthers;
    private FamilyTree<T> familyTree; 
    private Person person;
    private Human human;
    private Others others;
    private FindHuman findHuman;
    private AddPerson addPerson;
    private NameComparator nameComparator;
    private SortById sortById;
    private SortByLastName sortByLastName;
    private HumanIterator humanIterator;
    private IdComparator idComparator;
    private SaveBinFormat saveBinFormat;
    private SaveTextFormat saveTextFormat;
    private SaveDocFormat saveDocFormat;
    private SaveMdFormat saveMdFormat;
    private ReadBin readBin;
    private ReadTxt readTxt;
    private ReadDoc readDoc;
    private ReadMd readMd;


    public Service(FamilyTree familyTree, FillHuman fillHuman, FillOthers fillOthers,
        SaveBinFormat saveBinFormat, SaveTextFormat saveTextFormat,
        SaveDocFormat saveDocFormat,SaveMdFormat saveMdFormat,
        SortById sortById, SortByLastName sortByLastName,
         FindHuman findHuman, AddPerson addPerson)
    {
        this.fillHuman = fillHuman;
        this.fillOthers = fillOthers;
        this.familyTree = familyTree;
        this.addPerson = addPerson;
        this.sortById = sortById;
        this.sortByLastName = sortByLastName;
        this.saveBinFormat = saveBinFormat;
        this.saveTextFormat = saveTextFormat;
        this.saveDocFormat = saveDocFormat;
        this.saveMdFormat = saveMdFormat;
    }

        public void addPerson() // добавление персон в список дерева
        {
            System.out.println("Печать дерева с Human: " 
            + addPerson.addPerson(fillHuman.fillByHuman()));
        }

        public FamilyTree addHuman() // добавление в дерево людей и вывод на экран
        {
            // System.out.println("Печать дерева с Human: "
            //  + addPerson.addPerson(fillHuman.fillByHuman()));
            return addPerson.addPerson(fillHuman.fillByHuman());
        }

        public FamilyTree addOthers()  // добавление в дерево других
        {
            // System.out.println("Печать дерева с Others: "
            //  + addPerson.addPerson(fillOthers.fillOthers()));
            return addPerson.addPerson(fillOthers.fillOthers());
        }

        public void FindHuman() // поиск людей в дереве по имени и фамилии
        {
            findHuman.findHuman();
        }

        public  void SaveBinFormat() throws IOException, ClassNotFoundException
        {

            InterfaceSave interfaceSave = new SaveBinFormat(); // сериализация дерева в бинарный формат
            interfaceSave.write(addPerson.addPerson(fillHuman.fillByHuman()));
            interfaceSave.write(addPerson.addPerson(fillOthers.fillOthers()));
        }

        public  void SaveTxtFormat() throws IOException, ClassNotFoundException
        {
            InterfaceSave interfaceSave = new SaveTextFormat();
            interfaceSave.write(addPerson.addPerson(fillHuman.fillByHuman()));
            interfaceSave.write(addPerson.addPerson(fillOthers.fillOthers()));
        }

        public  void SaveDocFormat() throws IOException, ClassNotFoundException
        {
            InterfaceSave interfaceSave = new SaveDocFormat();
            interfaceSave.write(addPerson.addPerson(fillHuman.fillByHuman()));
            interfaceSave.write(addPerson.addPerson(fillOthers.fillOthers()));
        }

        public  void SaveMdFormat() throws IOException, ClassNotFoundException
        {
            InterfaceSave interfaceSave = new SaveMdFormat();
            interfaceSave.write(addPerson.addPerson(fillHuman.fillByHuman()));
            interfaceSave.write(addPerson.addPerson(fillOthers.fillOthers()));
        }

        public  void ReadBin() throws IOException, ClassNotFoundException
        {
            interfaceRead interfaceread = new ReadBin();
            interfaceread.read(familyTree);    
        }

        public  void ReadTxt() throws IOException, ClassNotFoundException
        {
            interfaceRead interfaceread = new ReadTxt<>();
            interfaceread.read(familyTree);    
        }

        public  void ReadMd() throws IOException, ClassNotFoundException
        {
            interfaceRead interfaceread = new ReadMd<>();
            interfaceread.read(familyTree);    
        }

        public  void ReadDoc() throws IOException, ClassNotFoundException
        {
            interfaceRead interfaceread = new ReadDoc<>();
            interfaceread.read(familyTree);    
        }
        public void NameComparator() // сравнивает двух персон
        {
            nameComparator.compare(person, person);
        }
        
        public void SortById() // сортировка по id
        {
            FamilyTree familyTree1 = new FamilyTree();
            AddPerson addPerson = new AddPerson();
            FillHuman fillHuman = new FillHuman();
            familyTree1 = addPerson.addPerson(fillHuman.fillByHuman());
            sortById.sortBy(familyTree1); // передаём заполненное дерево и сортируем по убыванию id
            System.out.println("Список, отсортированный по id: " + familyTree1);
        }

        public void SortByLastName() // сортировка по имени
        {
            FamilyTree familyTree2 = new FamilyTree();
            AddPerson addPerson = new AddPerson();
            FillHuman fillHuman = new FillHuman();
            familyTree2 = addPerson.addPerson(fillHuman.fillByHuman());
            sortByLastName.sortByLastName(familyTree2);
            System.out.println("Список, отсортированный по имени: " + familyTree2);
        }

}