//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Smartphone{
    String owner;
    String location;

    Smartphone(String o, String l){
        owner = o;
        location = l;
    }
    void UpdateLocation (String newlocation){
        location = newlocation;
    }
    void ShowLocation ()
    {
        System.out.println(owner + "'s phone last seen in " + location);
    }
}
public class Main {
    public static void main(String[] args) {
    Smartphone phone1 = new Smartphone("Alice", "San Diego");
    phone1.UpdateLocation("Miramar library");
    phone1.ShowLocation();

    }
}