package com.example.demo.Subscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
        Subscription createdSubscription = subscriptionService.createSubscription(subscription);
        if (createdSubscription != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdSubscription);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
