import animalsClass.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Control {
    public static int command;
    public static ArrayList<Animals> animalsList = new ArrayList<>();
    public static String menu = """
            1. Посмотреть обитателей питомника
            2. Добавить обитателя
            3. Oбучить живoтное
            4. Посмотреть команды животного
            5. дать команду животному 
           """;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (command != 6) {

            System.out.println(menu);
            System.out.println("Введите команду меню ");
            command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 1 -> showListAnimal();
                case 2 -> addAnimal(animalsList);
                case 3 -> addSkill(animalsList);
                case 4 -> showSkill(animalsList);
                case 6 -> System.out.println("Bye!");

            }

        }




    }

    public static void addAnimal(ArrayList<Animals> animalsList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("В питомник можно поселить следующих животных:" +
                "\n 1. кошка " +
                "\n 2. Лошадь");
        System.out.println("Введите имя нового животного");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения нового животного");
        String birthday = scanner.nextLine();
        System.out.println("укажите к какому виду относится животное:" +
                "\n 1. Кошка " +
                "\n 2. Лошадь");

        command = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case 1 -> animalsList.add(new Cat(name, birthday));
            case 2 -> animalsList.add(new Horse(name, birthday));
        }
    }
    public static void showListAnimal(){
        System.out.println("Сейчас здесь живут  :");
        if (animalsList.size() > 0) {
            int i = 1;
            for (Animals x : animalsList ) {
                System.out.print(i + ". " + x.getName() + " " + x.getBirthday() +" "+ x.getTypeAnimal()+" |" );
                i += 1;
            }
            System.out.println();
        }else System.out.println("Питомник пуст");
    }
    public static void addSkill(ArrayList<Animals> animalsList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите номер животного которого хотите обучить");
        int numberAnimal =  scanner.nextInt()-1;
        animalsList.get(numberAnimal).addSkill();
    }
    public static void showSkill(ArrayList<Animals> animalsList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите номер животного которого хотите обучить");
        int numberAnimal =  scanner.nextInt()-1;
        animalsList.get(numberAnimal).showSkill();
    }
}
