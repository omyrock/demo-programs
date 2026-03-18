package com.example.demo.service.solid;

public class DependencyInversionPrincipal_5 {
    public static void main(String[] args) {
        MessageService messageService =new  EmailService();
        Notification notification= new Notification(messageService);
           notification.notifyMessege("Hellow via mail");
    }
    /*
    High Level Module Should Not Depend On Low Level Module , but rather both
    should depend on abstraction
     */
}
  interface MessageService {
    void sendMessege(String messege);
  }
  class EmailService implements MessageService {
// low level module
      @Override
      public void sendMessege(String messege) {
          System.out.println("Email Sent : "+messege);
      }
  }
  class SmsService implements MessageService {

      @Override
      public void sendMessege(String messege) {
          System.out.println("Messege sent :"+messege);
      }
  }
// High Level Module
   class Notification{
   private MessageService messegService;

    public Notification(MessageService messageService) {
        this.messegService = messageService;
    }
    public void notifyMessege(String messege){
      messegService.sendMessege(messege);
    }
}
