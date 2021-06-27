package day57_abstraction_polymorphism;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    //Interface class is the only one who can extends multiple only interfaces. can not extend abstract
}
