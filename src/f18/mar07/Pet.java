package f18.mar07;

/**
 *
 * @author Calum
 */
public abstract class Pet {
   private String name;
   private String breed;

public Pet(String name, String breed)
    {
        setName(name);
        setBreed(breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String Breed) {
        this.breed = Breed;
    }
    
public abstract String speak();

}