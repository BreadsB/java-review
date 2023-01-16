package org.breadsb.accesmodifier;

public class ModifierClass {

    String defaultMethod(String path) {
        return "protected from: " + path;
    }
    private String privateMethod(String path) {
        return "Private from: " + path;
    }
    protected String protectedMethod(String path) {
        return "Protected from: " + path;
    }
    public String publicMethod(String path) { return "Public from: " + path; }
}
