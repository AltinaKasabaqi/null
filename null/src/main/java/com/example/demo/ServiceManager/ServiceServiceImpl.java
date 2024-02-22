package com.example.demo.ServiceManager;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceServiceImpl implements ServiceService{
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Service createService(Service service) {
        return serviceRepository.save(service);
    }
}
