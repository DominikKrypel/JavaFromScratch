public class ReadOnly {

    private String name;

    public String getName() {
        return name = name + " jest ok";
    }

    public void setName(String name) {
        this.name = name;
    }
}
