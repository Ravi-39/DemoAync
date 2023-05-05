package com.ravi.AsyncData;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Component
public class NotificationService {

    @Async
    public void sendTextMessage() {

       
        System.out.println("Ravi Program code " + Thread.currentThread().getName());
   
    }

    
    @Async
    public Future<String> asyncMethodWithReturnType() {
        System.out.println("Execute method asynchronously - " 
          + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
            return new AsyncResult<String>("hello world !!!!" + new Date());
        } catch (InterruptedException e) {
            //
        }

        return null;
    }

    
}
