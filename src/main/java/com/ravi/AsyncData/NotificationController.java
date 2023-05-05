package com.ravi.AsyncData;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/send")
    public String sendMessage() throws InterruptedException, ExecutionException {
        notificationService.sendTextMessage();
        
       // Thread.sleep(7000);
        Future<String> asyncMethodWithReturnType = notificationService.asyncMethodWithReturnType();
		Future<String> future =
        		asyncMethodWithReturnType;
        return "message sent successfully!!!! : " + future.get() + "::" + Thread.currentThread().getName();
    }
}
