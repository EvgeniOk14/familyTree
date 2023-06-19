package projectFamilyTree.model.FamilyTree;

import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillOthers;
import projectFamilyTree.model.Persons.Others;
import projectFamilyTree.model.Persons.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOthers<Person extends Others>
{
    public void findOthers() throws IOException, ClassNotFoundException
    {

        List<Person> listPerson = new ArrayList<>();
        FillOthers fo = new FillOthers();
        listPerson = fo.fillOthers();


        System.out.println("Введите имя для поиска:");
        Scanner sc1 = new Scanner(System.in);
        String findName = sc1.nextLine();

        System.out.println("Введите должность для поиска:");
        Scanner sc2 = new Scanner(System.in);
        String findOcupation = sc2.nextLine();

        boolean find = false;
        for (int i = 0; i < listPerson.size(); i++)
        {
            if (listPerson.get(i).getName().equalsIgnoreCase(findName)
                    && listPerson.get(i).getOccupation().equalsIgnoreCase(findOcupation)) {

                System.out.println(listPerson.get(i));
                find = true;
            }
        }

        if(find == false)
        {
            System.out.println("По заданным параметрам нет такого объекта в списке! ");
        }
    }
}

