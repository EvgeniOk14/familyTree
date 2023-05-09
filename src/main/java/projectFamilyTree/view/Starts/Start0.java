package projectFamilyTree.view.Starts;

import projectFamilyTree.view.tablo.interfaceTablo;
import projectFamilyTree.view.tablo.tabloStart;

public class Start0 implements interfaceStart
{

    @Override
    public int start() 
    {
        interfaceTablo interfacetablo = new tabloStart();
        interfacetablo.tablo();
            int choice = ReadNumber.readNumberConsole();

                while(choice < 1 || choice > 6)
              {
                System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
                  interfacetablo.tablo();
                choice = ReadNumber.readNumberConsole();
              }  
        return choice;     
    }
    
}
