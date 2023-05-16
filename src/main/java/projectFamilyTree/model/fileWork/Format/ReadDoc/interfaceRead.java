package projectFamilyTree.model.fileWork.Format.ReadDoc;

import projectFamilyTree.model.FamilyTree.FamilyTree;

import java.io.IOException;

public interface interfaceRead<T>
{
    String read(T t) throws IOException, ClassNotFoundException;
}
