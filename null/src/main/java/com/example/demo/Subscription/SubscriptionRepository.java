package com.example.demo.Subscription;

import com.example.demo.CustomerManager.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
