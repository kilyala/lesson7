package ru.geekbrains.javaLevel1;

public class ImmutableCat {

    private final String name;
    private final int age;

    private final ImmutableCat[] children;

    public ImmutableCat(String name, int age, ImmutableCat[] children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }


    public ImmutableCat[] getChildren() {
        return children;
    }
}
