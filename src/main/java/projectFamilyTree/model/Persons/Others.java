package projectFamilyTree.model.Persons;

import java.io.Serializable;

public class Others extends Person implements Serializable, InterfaceOthers

{
    private String Name;
    private String Occupation;

    public Others(int id, String Name, String Occupation)
    {
        super.id = id;
        this.Name = Name;
        this.Occupation = Occupation;
    }    

    public Others(int id, String Name)
    {
        this(id, Name, null);    
    }

    public Others(int id)
    {
        this(id, null, null);     
    }

    public Others()
    {
        this(0,  null, null);
    }
    


    public String getName() 
    {
        return Name;
    }
    public void setName(String name)
    {
       this.Name = name;

    }

    public String getOccupation()
    {
        return Occupation;
    }
    public void setOccupation(String occupation)
    {
        this.Occupation = occupation;

    }


    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(id).append(", имя: ").append(Name).append("\n").append("   должность:  ").append(Occupation).append("\n");
        return sb.toString();
    }


    @Override
    public int compareTo(Person o)
    {
        return 0;
    }
}


