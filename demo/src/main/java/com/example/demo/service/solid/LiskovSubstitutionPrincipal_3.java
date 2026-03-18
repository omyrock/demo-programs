package com.example.demo.service.solid;

public class LiskovSubstitutionPrincipal_3 {
    /* Parent class Object should be the substitution of child class Object.
     without affecting the correctness of the program.
     Example Below
     */
}
abstract class Account{
     abstract void  creditAmount();
    abstract void withdrawAmount();
}
 class  SavingAccount  extends Account{
     @Override
     void creditAmount() {
     }
     @Override
     void withdrawAmount() {
     }
 }
 class CurrentAccount extends Account{
     @Override
     void creditAmount() {
     }
     @Override
     void withdrawAmount() {
     }
 }
  class FixDepositeAccount extends Account{
      @Override
      void creditAmount() {
      }
      @Override
      void withdrawAmount() {
          /*Here is the breaking the rule of Liskov Principal , because FD
             should not have withdraw method
           */

          /* in this case we  have to make 2 types of interface one is nonwithdrawble
          and withdrawable account
          and have to declare abstract method accordingly
           */
      }
  }