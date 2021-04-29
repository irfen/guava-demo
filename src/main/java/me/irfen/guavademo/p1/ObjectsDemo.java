package me.irfen.guavademo.p1;

import com.google.common.base.Objects;
import org.junit.Test;

public class ObjectsDemo {

    @Test
    public void equalTest() {
        String a1 = "abc";
        String a2 = "abc";
        System.out.println(Objects.equal(a1, a2));
        System.out.println(java.util.Objects.equals(a1, a2));
    }

    @Test
    public void hashCodeTest() {
        String a1 = "abc";
        String a2 = "def";
        System.out.println(Objects.hashCode(a1, a2));
        System.out.println(java.util.Objects.hash(a1, a2));
    }

}
