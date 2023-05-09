package projectFamilyTree.view.Starts;

import projectFamilyTree.view.tablo.interfaceTablo;
import projectFamilyTree.view.tablo.tabloRead;

public class Start3 implements interfaceStart
{

    @Override
    public int start() 
    {
        interfaceTablo interfacetablo = new tabloRead();
        interfacetablo.tablo();
            int number = ReadNumber.readNumberConsole();
            while(number < 1 || number > 5)
            {
                System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
                interfacetablo.tablo();
                number = ReadNumber.readNumberConsole();
            }
          return number;
    }
    
}
