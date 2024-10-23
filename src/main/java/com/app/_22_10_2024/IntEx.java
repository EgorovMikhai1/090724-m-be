package com.app._22_10_2024;

public class IntEx {
    public void doSomething(DoAble doAble) {
        System.out.println();
    }
}

class AA implements DoAble {

    @Override
    public void doSomething() {

    }
}

class BB {

}

class CC extends AA {

}

class DD extends BB implements DoAble {
    @Override
    public void doSomething() {

    }
}

interface DoAble {
    void doSomething();
}
