package com.example.demo.ContractManager;

import org.springframework.beans.factory.annotation.Autowired;

public class ContractServiceImpl implements  ContractService{
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }


}
