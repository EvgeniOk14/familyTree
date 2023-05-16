package projectFamilyTree.model.FamilyTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.Persons.Human;
import projectFamilyTree.model.Persons.Person;
import projectFamilyTree.model.FamilyTree.FamilyTree;
    public class FindHuman<Person extends Human> 
    {
    
        public <Person extends Human> void findHuman() throws IOException, ClassNotFoundException {
            FillHuman fillHuman = new FillHuman();
            List<Human> familyTree = fillHuman.fillByHuman();
            System.out.println("Введите фамилию для поиска:");
            Scanner sc1 = new Scanner(System.in, "cp866");
            String findLastName = sc1.nextLine();

            System.out.println("Введите имя для поиска:");
            Scanner sc2 = new Scanner(System.in, "cp866");
            String findFirstName = sc2.nextLine();

//            boolean find = false;
       
        
            for (int i = 0; i < familyTree.size(); i++)
            {
                boolean find = false;
                if (((Human) familyTree.get(i)).getLastName().toLowerCase().equals(findLastName.toLowerCase())
                &&  ((Human) familyTree.get(i)).getFirstName().toLowerCase().equals(findFirstName.toLowerCase()));
                    {
                        System.out.println(familyTree.get(i));
                        find = true;
                    }
        
                if (find == false)
                    {
                        System.out.println("Такой человек не найден.");
                    }
            }
        }
    }


