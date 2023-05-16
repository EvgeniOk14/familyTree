package projectFamilyTree.model.FamilyTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projectFamilyTree.model.Comparator.IdComparator;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
import projectFamilyTree.model.Persons.Human;
import projectFamilyTree.model.Persons.Person;
import projectFamilyTree.model.FamilyTree.FamilyTree;
    public class FindHuman<Person extends Human>
    {

        public void findHuman() throws IOException, ClassNotFoundException
        {

            List<Person> listPerson = new ArrayList<>();
            FillHuman fh = new FillHuman();
            listPerson = fh.fillByHuman();


            System.out.println("Введите фамилию для поиска:");
            Scanner sc1 = new Scanner(System.in);
            String findLastName = sc1.nextLine();

            System.out.println("Введите имя для поиска:");
            Scanner sc2 = new Scanner(System.in);
            String findFirstName = sc2.nextLine();

            boolean find = false;
            for (int i = 0; i < listPerson.size(); i++)
            {
                if (listPerson.get(i).getLastName().equalsIgnoreCase(findLastName)
                        && listPerson.get(i).getFirstName().equalsIgnoreCase(findFirstName)) {

                    System.out.println(listPerson.get(i));
                    find = true;
                }
            }

            if(find == false)
                {
                    System.out.println("Нет такого человека в списке! ");
                }
        }
    }




