package projectFamilyTree.model.fileWork.Format.ReadDoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt<T> implements interfaceRead<T>
{

    @Override
    public String read(T t) throws IOException, ClassNotFoundException 
    {
        FileReader fr = new FileReader("file.txt");
        BufferedReader buff = new BufferedReader(fr);
        String str;
        System.out.println("\nВывод из файла формата .txt\n ");
        StringBuilder sb = new StringBuilder();
            while((str = buff.readLine()) != null)
            {
                sb.append(str);
                System.out.println(str);
            }
        buff.close();
        System.out.println("Данные восстановлены! ");
        return sb.toString();    
    }
    
}
