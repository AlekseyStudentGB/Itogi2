package animalsClass;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animals {
    protected String name;
    protected String birthday;
    protected String typeAnimal;
    protected Map<String,String> skill ;
    protected Animals(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.skill = new HashMap<String,String>();
    }

    public String getName() {
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getTypeAnimal(){
        return typeAnimal;
    }
    public void showSkill(){
        for (String x: skill.keySet()) {
            System.out.println(x);
        }
    }
    public void addSkill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введидnе название умения");
        String name = scanner.nextLine();
        System.out.println("Опешите что произойдет");
        String description = scanner.nextLine();
        skill.put(name, description);

    }
}
