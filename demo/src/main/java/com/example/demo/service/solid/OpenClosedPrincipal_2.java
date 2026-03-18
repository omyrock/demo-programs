package com.example.demo.service.solid;

public class OpenClosedPrincipal_2 {
    /*
    A class should be open for the extension and closed for the
    modification.
    LIKE -If a class have some operation  like SavingTheDatabase and have
    one method save in MYSQL db and if you want to add the one more method to
    save the database in MONGODB Also, then it is breaking the OPEN CLOSED PRINCIPAL
    for this we have to go with OOPS-
    */
    //1-Use Abstract class Example Below


}
 abstract class  DbSaving{
     abstract void  dbSaving();
  }
  class MysqlSaving extends DbSaving{

      @Override
      void dbSaving() {
          System.out.println("Mysql Data Saving");
      }
  }

  class MongoDbSaving extends DbSaving{

      @Override
      void dbSaving() {
          System.out.println("MongoDB data saved");
      }
  }
  class UsingDb{


      public static void main(String[] args) {
          DbSaving mysql= new MysqlSaving();// RunTime Polymorphism
          mysql.dbSaving();
          // HERE MYSQL logic method work
          // same we can do for others
      }
  }


