public class Item {
    String name;
    public Item(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object s){
        String str = (String) s;
        if(this.name.equals(str))
            return true;
        else
            return false;
    }
}
