package com.example.demo.service;



import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorService {
    public static void main(String[] args) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//           scheduledExecutorService.schedule( ( )->
//                   System.out.println("This task is delayed 5 sec"),5,TimeUnit.SECONDS
//           );


        //// SCHEDULED IS USED TO DELAY THA TASK FOR THE PARTICULAR TIME PERIOD
          scheduledExecutorService.scheduleAtFixedRate(
                  ()-> System.out.println("task is executed after every 5 sec"),
                  5,
                  5,
                  TimeUnit.SECONDS
          );
          // scheduledAtFixedRate is used to run the task after a particular time period as the given example

          scheduledExecutorService.schedule(
                  ()->{
                      System.out.println("initiating shutdown....");
                      scheduledExecutorService.shutdown();

                  },20,TimeUnit.SECONDS
          );
//           scheduledExecutorService.shutdown();
    }
}
