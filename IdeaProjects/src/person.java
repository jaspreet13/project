public class person {
   private String name;
    private String haircolor;
    private String skincolor;
    int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaircolor() {
        return haircolor;
    }


    public String getColor() {
        return haircolor;
    }

    public void setHairColor(String color) {

        if (color == "Black"||color == "brown") {
            System.out.println("Correct color");
            this.haircolor = color;
        }
        else
            {
            System.out.println("invalid color");

        }
    }

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;
    public void eat()
    {
        System.out.println("eating an apple");
    }
    public  void sleep(int hours)
    {
        System.out.println("sleeping for hours" +hours);
    }
    public  void walk()
    {
        System.out.println("walking is good for health");
    }

    public  void play(String game)
    {
        System.out.println("i like to play " + game);
    }
    public  void study()
    {
        System.out.println("i preference to study in morning");
    }


}
