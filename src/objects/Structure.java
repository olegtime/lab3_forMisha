package objects;

public class Structure extends Global{

    private final String MATERIAL;

    public Structure(String name, String material){
        super(name);
        this.MATERIAL = material;
    }

    public String getMaterial(){
        return this.MATERIAL;
    }
}
