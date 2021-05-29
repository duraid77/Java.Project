package day48_constructors_static;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DurationDV;

public class Customer {
    private String name;
    private int id;


    public Customer(){
        this.name = "Duraid";
        this.id = 65123582;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
