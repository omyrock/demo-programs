package com.example.demo.service.java17;

sealed class SealedClasses permits Circle,Sqaure  {
    public void AreaCalulation(){
        System.out.println("Area");
    }
}

final class Circle extends SealedClasses{
    public static void main(String[] args) {
        SealedClasses sealedClassesS= new Circle();
        SealedClasses circle = new SealedClasses();
        circle.AreaCalulation();


    }
}
final class Sqaure extends SealedClasses{
    public void AreaCalulation(){
        System.out.println("Sqaure Area");
    }
}

