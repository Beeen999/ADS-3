public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 83 * hash + id;
        hash = 83 * hash + (name != null ? name.length() : 0);
        for (int i = 0; name != null && i < name.length(); i++) {
            hash = 83 * hash + name.charAt(i);
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id &&
                (name != null ? name.equals(other.name) : other.name == null);
    }

    @Override
    public String toString() {
        return "MyTestingClass{id=" + id + ", name='" + name + "'}";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
