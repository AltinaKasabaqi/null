package com.example.demo.Subscription;

import org.springframework.beans.factory.annotation.Autowired;

public class SubscriptionServiceImpl implements SubscriptionService{
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription createSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }
}
