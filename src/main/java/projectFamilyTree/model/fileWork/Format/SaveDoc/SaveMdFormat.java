package projectFamilyTree.model.fileWork.Format.SaveDoc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import projectFamilyTree.model.FamilyTree.FamilyTree;

public class SaveMdFormat<T extends FamilyTree> implements InterfaceSave<T>
{

    @Override
    public void write(FamilyTree familyTree) throws IOException, ClassNotFoundException
    {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.md");
        File file = new File(pathFile);
        FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
        writer.write("##<MD Format>\n");
        writer.write(familyTree.toString()); 
        writer.flush(); 
    }
    
}
