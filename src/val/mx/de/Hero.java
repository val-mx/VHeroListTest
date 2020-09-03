package val.mx.de;

public class Hero {
    private int ap;
    private String name;

    public Hero(int ap, String name) {
        this.ap = ap;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name + "\f AP : " + ap);
    }

    public int getAp() {
        return ap;
    }
}
