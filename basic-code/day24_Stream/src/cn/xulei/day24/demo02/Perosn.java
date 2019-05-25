package cn.xulei.day24.demo02;

public class Perosn {
    private String name;

    public Perosn(String name) {
        this.name = name;
    }

    public Perosn() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Perosn{" +
                "name='" + name + '\'' +
                '}';
    }
}
