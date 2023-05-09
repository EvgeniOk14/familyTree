package projectFamilyTree.view.Starts;
import projectFamilyTree.view.View;
import projectFamilyTree.model.Persons.Person;
import projectFamilyTree.presenter.Presenter;
import projectFamilyTree.model.FamilyTree.FamilyTree;

import java.io.IOException;
import java.util.Scanner;

public class Console<T extends Person, E extends FamilyTree> implements View<T, E>
 {
    static Scanner scanner;
    private Presenter presenter;
    private static boolean work = true;

        public Scanner console()
        {
           Scanner scanner = new Scanner(System.in, "Cp866");
           return scanner;
        }

        public void exit()
        {
            System.out.println("Работа завершена, Вы вышли из программы! ");
//            scanner.close();
            work = false;
        }


    @Override
    public void StartProgram() throws ClassNotFoundException, IOException 
    {
        while (work) 
            {
                interfaceStart interfaceStart = new Start0();
                int choice = interfaceStart.start();

            switch (choice) 
            {
                case 1:
                    ConsoleTreeFillsByPersons(); // наполнение дерева людьми и вывод дерева на экран
                    break;

                case 2:
                    SecondStartProgram();
                    break; // переход в другое меню
                case 3:
                    ConsoleFindPerson(); // поиск человека в дереве по имени и фамилии
                    break;
           
                case 4:
                    ConsoleSortById(); // сортировка дерева по id
                    break;

                case 5:
                    ConsoleSortLastName(); // сортировка дерева по имени
                    break;
                case 6:
                    exit(); // выход из программы
                    break;

                default:
                    System.out.println("Ошибка ввода, Вы ввели неправильные данные! ");
                    break;
            }
        }
    }

    public void SecondStartProgram() throws ClassNotFoundException, IOException
    {
        while(work)
        {
    interfaceStart interfaceStart = new Start1(); // второе меню
            int number = interfaceStart.start();
            
            switch (number)
                {

                case 1:
                    ConsoleSaveBinFormat(); // сериализация данных дерева в бинарный формат
                    System.out.println("Поздравляю!\n" + "Бинарный файл txt.bin был успешно создан!\n");
                    SecondStartProgram();
                    break;
                case 2:
                    ConsoleSaveTxtFormat();
                    System.out.println("Поздравляю!\n" + "Файл формата .txt был успешно создан!\n");
                    SecondStartProgram();
                    break;
                case 3:
                    ConsoleSaveDocFormat();
                    System.out.println("Поздравляю!\n" + "Файл формата .doc был успешно создан!\n");
                    SecondStartProgram();
                    break;
                case 4:
                    ConsoleSaveMdFormat();
                    System.out.println("Поздравляю!\n" + "Файл формата .md был успешно создан!\n");
                    SecondStartProgram();
                    break;
                case 5:
                    ThirdStartProgram();
                    break;
                case 6:
                    System.out.println("Вы вышли из программы.");
                    exit();
                    break;
          
                default: 
                System.out.println("Будьте внимательней при вводе! Некоректный ввод! ");
                break;
                }   
            }        
    }

    public void ThirdStartProgram() throws ClassNotFoundException, IOException
    {
        while(work)
        {
            interfaceStart interfaceStart = new Start2(); // третье меню
            int number = interfaceStart.start();
        
            switch (number)
            {
                case 1:
                    interfaceStart interfaceStart1 = new Start3(); // четвёртое меню
                    int number2 = interfaceStart1.start();
            
                    switch (number2)
                    {
                        case 1:
                        ConsoleReadBinFormat();
                            System.out.println("Загрузка данных в программу из бинарного файла успешно завершена!\n");
                            ThirdStartProgram();
                            break;

                        case 2:
                            ConsoleReadTxtFormat();
                            System.out.println(" file.txt формата был успешно считан: \n");
                            ThirdStartProgram();
                            break;

                        case 3:
                            ConsoleReadDocFormat();
                            System.out.println(" file.doc формата был успешно считан: \n");
                            ThirdStartProgram();
                            break;

                        case 4:
                            ConsoleReadMdFormat();
                            System.out.println(" file.md формата был успешно считан: \n");
                            ThirdStartProgram();
                            break;

                        case 5:
                            System.out.println("Вы вышли из программы.");
                            exit();
                            break;
          
                        default: 
                        System.out.println("Будьте внимательней при вводе! Некоректный ввод! ");
                        break;
                    }  
                
                case 2:
                    SecondStartProgram();    
                    break;
                case 3: 
                    System.out.println("Вы вышли из программы!");
                    exit();
                    break;
                    

                default : 
                System.out.println("Будьте внимательней при вводе! Некоректный ввод! ");
                break;    
            } 
        }   
       
    }    


    @Override
    public void printPersons(E e, int x) 
    {
        if (x==1)
        {
            System.out.println("Печать дерева c Human: " + e);
        }
        else if(x==2)
        {
            System.out.println("Печать дерева c Others: " + e);   
        } 
    }

    @Override
    public void print(String text) 
    {
       System.out.println(text);
    }

    @Override
    public void setPresenter(Presenter presenter) 
    {
        this.presenter = presenter;
    }  
    
    /*методы консоли связанные с презентерем:  */

    public void ConsoleTreeFillsByPersons() // заполнения дерева людьми (Human)
    {
        presenter.PresenterTreeFillsByPersons();
    }

    public void ConsoleFindPerson() // поиск персоны в дереве по имени и фамилии
    {
        presenter.PresenterFindPerson();
    }

    public void ConsoleSortById() // сортировка дерева по id
    {
        presenter.PresenterSortById();
    }

    public void ConsoleSortLastName() // сортировка дерева по имени
    {
        presenter.PresenterSortByName();
    }

    // методы для записи дерева:

    public void ConsoleSaveBinFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterSaveBinFormat(); // сохранение в текстовом формате
    }

    public void ConsoleSaveTxtFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterSaveTxtFormat();
    }

    public void ConsoleSaveDocFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterSaveDocFormat();
    }

    public void ConsoleSaveMdFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterSaveMdFormat();
    }

    // методы для чтения дерева из файлов:

    public void ConsoleReadBinFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterReadBinFormat();
    }

    public void ConsoleReadTxtFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterReadTxtFormat();
    }

    public void ConsoleReadDocFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterReadDocFormat();
    }

    public void ConsoleReadMdFormat() throws IOException, ClassNotFoundException
    {
        presenter.PresenterReadMdFormat();
    }



    

}