package animalsClass;

public class Vuchnie_animals extends Animals{


    protected Vuchnie_animals(String name, String birthday) {
        super(name, birthday);
        this.typeAnimal = "Вьючное животное";
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }
}
