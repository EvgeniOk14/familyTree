package projectFamilyTree.view.Starts;

import projectFamilyTree.view.tablo.interfaceTablo;
import projectFamilyTree.view.tablo.tabloSave;

public class Start1 implements interfaceStart {

    @Override
    public int start() 
    {
            interfaceTablo interfacetablo = new tabloSave();
        interfacetablo.tablo();
            int number = ReadNumber.readNumberConsole();
            while(number < 1 || number > 6)
              {
                System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
                // 
                  interfacetablo.tablo();
                number = ReadNumber.readNumberConsole();
              }  
        return number;
        }
 
    }
    

