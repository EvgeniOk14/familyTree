package projectFamilyTree.presenter;
import projectFamilyTree.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projectFamilyTree.model.*;
import projectFamilyTree.model.Service;
import projectFamilyTree.model.FamilyTree.FamilyTree;
import projectFamilyTree.model.FamilyTree.FindHuman;
import projectFamilyTree.model.FamilyTree.AddIntoTree.FillHuman;
// import model.FamilyTree.AddIntoTree.AddHuman;
import projectFamilyTree.model.Persons.Human;
import projectFamilyTree.model.Persons.Person;
import projectFamilyTree.presenter.Presenter;
import projectFamilyTree.view.Starts.Console;


public class Presenter<T> 
{
    private View view;
    private Service service;



    public Presenter(View view, Service service)
    {
        this.view = view;
        this.service = service;
        view.setPresenter(this);

    }

    public void PresenterTreeFillsByPersons() throws IOException, ClassNotFoundException // добавление людей в дерево и вывод дерева на экран
    {
        view.printPersons(service.addHuman(), 1);
        
        view.printPersons(service.addOthers(), 2);
        
    }

    public void PresenterFindPerson() throws IOException, ClassNotFoundException // нахождение персоны по имени и фамилии
    {
        service.FindHuman();
    }

    public List<Person> PresenterSortById() throws IOException, ClassNotFoundException // сортировка дерева id
    {
       return service.serviceSortById();
    }

    public List<Person> PresenterSortByName() throws IOException, ClassNotFoundException // сортировка дерева по имени
    {
        return service.SortByLastName();
    }

    // методы для записи в файл:

    public void PresenterSaveBinFormat() throws IOException, ClassNotFoundException
    {
        service.SaveBinFormat(); // сериализация дерева в бинарный файл
    }

    public void PresenterSaveTxtFormat() throws IOException, ClassNotFoundException
    {
        service.SaveTxtFormat(); // сохранение дерева в текстовом формате
    }

    public void PresenterSaveDocFormat() throws IOException, ClassNotFoundException
    {
        service.SaveDocFormat();  // сохранение дерева в формате Doc
    }

    public void PresenterSaveMdFormat() throws IOException, ClassNotFoundException
    {
        service.SaveMdFormat(); // сохранение дерева в формате Md
    }

    // методы для чтения из файлов:

    public void PresenterReadBinFormat() throws IOException, ClassNotFoundException
    {
        service.ReadBin(); // чтение дерева из бинарного файла (десериализация) и загрузка данных в дерево
    }

    public void PresenterReadTxtFormat() throws IOException, ClassNotFoundException
    {
        service.ReadTxt(); // чтение дерева из текстового файла
    }

    public void PresenterReadDocFormat() throws IOException, ClassNotFoundException
    {
        service.ReadDoc(); // чтение дерева из док файла
    }

    public void PresenterReadMdFormat() throws IOException, ClassNotFoundException
    {
        service.ReadMd(); // чтение дерева из Md файлала
    }


}
    