package com.example.demo.service.solid;

public class InterfaceSegregationPrincipal_4 {
    /* client should not be forced the implement the methods
     they don't use
     */

}
abstract class Shape{
    abstract void area();
    abstract void volume();
}
class Rectangle extends Shape{
    @Override
    void area() {
    }
    @Override  //DONT need to implement the volume but
            // still need to implement the method thus this is the
            // breaking the interface segregation principal
    void volume() {
    }
}
class Square extends Shape{// HERE sqaure dont need the volume but still need to
    // implement the volume
    @Override
    void area() {
    }
    @Override
    void volume() {
    }
}
class Qube extends Shape{
    @Override
    void area() {
    }
    @Override
    void volume() {
    }
}


/*
for the solution of it we have to define the two segregate interface
one is 2D shape (Square,Rectangle ) another is 3D shape (qube)
 */
