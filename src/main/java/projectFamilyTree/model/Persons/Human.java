package projectFamilyTree.model.Persons;

import projectFamilyTree.model.Comparator.IdComparator;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Human extends Person implements Serializable, InterfaceHuman
{

    public Human(int id, String lastName, String firstName, Gender gender, LocalDate dataDeath, LocalDate dataBirth, Person father, Person mother, ArrayList<Person> children)
    {
        super.id = id;
        super.lastName = lastName;
        super.firstName = firstName;
        super.gender = gender;
        super.dataDeath = dataDeath;
        super.dataBirth = dataBirth;
        super.father = father;
        super.mother = mother;
        super.children =children;

    }
    public Human()
    {
        super(0, null, null, null, null,
                null, null, null, null);
    }


    public void createHuman() throws IOException, ClassNotFoundException
    {
        Human human = new Human();
        System.out.println("Введите id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        human.setId(id);
        System.out.println("Введите имя: ");
        Scanner sc1 = new Scanner(System.in);
        String lastName = sc1.nextLine();
        human.setLastName(lastName);
        System.out.println("Введите фамилию: ");
        Scanner sc2 = new Scanner(System.in);
        String firstName = sc2.nextLine();
        human.setFirstName(firstName);
        System.out.println("Введите пол: ");
        Scanner sc3 = new Scanner(System.in);
        String gender  = sc3.nextLine();
        human.setGender(Gender.valueOf(gender));
//        human.setDataDeath(null);
        System.out.println("Введите дату рождения: ");
        Scanner sc5 = new Scanner(System.in);
        LocalDate dataBirth  = LocalDate.parse(sc5.nextLine());
        human.setDataBirth(dataBirth);
//        human.setFather(null);
//        human.setMother(null);
//        human.setChildren(null);
        System.out.println(human);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(id).append(" фамилия: ").append(lastName).append(", имя: ").append(firstName).append("\n");
        sb.append(" дата рождения: ").append(dataBirth);
        if (dataDeath == null)
            {
                sb.append(" возраст: ").append(getAge()).append("\n");
            }
        else
            {
                sb.append(", дата смерти: ").append(dataDeath).append("\n");
            }
        if(gender == Gender.Male)
            {
                sb.append(" пол мужской: ").append(gender).append("\n");
            }
        else
            {
                sb.append(" женский пол:").append(gender).append("\n");
            }
        if(father == null)
            {
                sb.append(" отец не определён ").append("\n");
            }
        else
            {
                sb.append(" отец id: ").append(father.getId()).append(" фамилия: ").append(father.getLastName()).append(", имя:  ").append(father.getFirstName()).append(", год рождения: ").append(father.getDataBirth()).append("\n");
            }
        if(mother == null)
            {
                sb.append(" мать не определёна ").append("\n");
            }
        else
            {
                sb.append(" мать id: ").append(mother.getId()).append(" фамилия: ").append(mother.getLastName()).append(", имя:  ").append(mother.getFirstName()).append(", год рождения: ").append(mother.getDataBirth()).append("\n");
            }
        if (children == null)
            {
                sb.append(" детей нет").append("\n");
            }
        else
            {
                sb.append(" дети: ").append("\n");
                for (int i =0; i < children.size(); i++)
                    {
                        if(children.get(i).getGender() == Gender.Male)
                            {
                                sb.append(" сын : ");
                            }
                        else
                            {
                                sb.append(" дочь: ");
                            }
                        sb.append(" id: ").append(children.get(i).getId());
                        sb.append(" фамилия: ").append(children.get(i).getLastName());
                        sb.append(" имя: ").append(children.get(i).getFirstName());
                        sb.append(" дата рождения: ").append(children.get(i).getDataBirth()).append("\n");
                    }
            }
        return sb.toString();
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
//    public List<Person> sort(IdComparator idComparator)
//    {
//        return (ArrayList<Person>) familyTree;
//    }
}
