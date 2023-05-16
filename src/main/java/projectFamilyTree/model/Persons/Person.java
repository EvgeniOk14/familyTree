package projectFamilyTree.model.Persons;

import projectFamilyTree.model.Iterator.HumanIterator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public abstract class Person implements InterfacePerson, Comparable<Person>
{
    public int id;
    public Person father;
    public Person mother;
    public Gender gender;
    public String firstName;
    public String lastName;
    public LocalDate dataBirth;
    public LocalDate dataDeath;
    public ArrayList<Person> children;




    public Person(int id, String lastName, String firstName, Gender gender,
    LocalDate dataBirth, LocalDate dataDeath, Person father, Person mother, ArrayList<Person> children)
    {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.dataBirth = dataBirth;
        this.dataDeath = dataDeath;
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.dataBirth = dataBirth;
        this.dataDeath = dataDeath;
    }
//
//    public Person();

    public Person(int id, String lastName, String firstName,Gender gender,
                 LocalDate dataBirth, LocalDate dataDeath,
                 Person father, Person mother)
    {
        this(id, lastName, firstName, gender, dataBirth, dataDeath,
                father, mother,null);

    }

    public Person(int id, String lastName, String firstName,Gender gender,
                 LocalDate dataBirth, LocalDate dataDeath, Person father)
    {
        this(id, lastName, firstName, gender, dataBirth, dataDeath,
                father, null, null);
    }

    public Person(int id, String lastName, String firstName,
                 Gender gender, LocalDate dataBirth, LocalDate dataDeath)
    {
        this(id, lastName, firstName, gender, dataBirth,
                null, null, null,null);
    }

    public Person(int id, String lastName, String firstName, Gender gender,
                 LocalDate dataBirth)
    {
        this(id, lastName, firstName, gender, dataBirth,
                null, null, null, null);
    }

    public Person(int id, String lastName, String firstName, Gender gender)
    {
        this(id, lastName, firstName, gender, null,
                null, null, null, null);
    }

    public Person(int id, String lastName, String firstName)
    {
        this(id, lastName, firstName, null, null,
                null, null, null,null);
    }

    public Person(int id, String lastName)
    {
        this(id, lastName, null, null, null,
                null, null,null, null);
    }

    public Person(int id)
    {
        this(id, null, null, null, null,
                null, null,null, null);
    }

    public Person()
    {
        this(0, null, null, null, null,
                null, null, null, null);
    }



    public void setId(int id)
    {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setFather(Person father)
    {
        this.father = father;
    }

    public Person getFather() 
    {
        return father;
    }
    public void setMother(Person mother) 
    {
        this.mother = mother;
    }
    public Person getMother() 
    {
        return mother;
    }

    public void setGender(Gender gender) 
    {
        this.gender = gender;
    }
    public Gender getGender() 
    {
        return gender;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getFirstName() 
    {
        return firstName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public String getLastName() 
    {
        return lastName;
    }

    public void setDataBirth(LocalDate dataBirth) 
    {
        this.dataBirth = dataBirth;
    }
    public LocalDate getDataBirth() 
    {
        return dataBirth;
    }
    public void setDataDeath(LocalDate dataDeath) 
    {
        this.dataDeath = dataDeath;
    }
    public LocalDate getDataDeath() {
        return dataDeath;
    }

    public void setChildren(ArrayList<Person> children) 
    {
        this.children = children;
    }
        public ArrayList<Person> getChildren()
        {
            return children;
        }


        public void addChildren(Person person)
        {
        if(this.children == null)
        {
            this.children = new ArrayList<>();
        }
        this.children.add(person);
        }

        public int getAge()
        {

        LocalDate currenDate = LocalDate.now();
        if (getDataDeath() == null)
            return Period.between(dataBirth, currenDate).getYears();
        else
            return Period.between(dataBirth, dataDeath).getYears();
        }

    @Override
    public int compareTo(Person o)
    {
        return Integer.compare(this.id, o.id);
    }
}
