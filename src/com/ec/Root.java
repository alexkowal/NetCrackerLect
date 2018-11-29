package com.ec;

public class Root {

    public int f1r;
    private int f2r;
    protected int f3r;
    int f4r;

    private void privateMethodRoot() {
        System.out.println("privateMethodRoot");
    }

    public void publicMethodRoot() {

        System.out.println("publicMethodRoot");
    }

    protected void protectedMethodRoot() {

        System.out.println("protectedMethodRoot");
    }

    void defaultMethodRoot() {

        System.out.println("defaultMethodRoot");
    }


}
