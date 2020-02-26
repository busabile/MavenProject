package com.letsoha;


public class App
{
    int age;
    String name;

    public App(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        // checking if both the object references are referring to the same object.
        if (this == obj)
        {
            return true;
        }
        // it checks if the argument is of the type App by comparing the classes of the passed argument and this object
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        // type casting of the argument.
        App app = (App) obj;

        // comparing the state of argument with the state of 'this' Object.
        return (app.name == this.name && app.age == this.age);
    }

    }
