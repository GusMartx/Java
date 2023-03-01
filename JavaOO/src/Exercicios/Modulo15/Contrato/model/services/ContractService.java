/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo15.Contrato.model.services;

import Exercicios.Modulo15.Contrato.model.entities.Contract;
import Exercicios.Modulo15.Contrato.model.entities.Installment;
import java.time.LocalDate;

/**
 *
 * @author Gustavo
 */
public class ContractService {
    
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    public void processContract(Contract contract, Integer months) {
        
        double amount = contract.getTotalValue() / months;
        
        for (int i = 1; i <= months; i++) {
            
            LocalDate date = contract.getDate().plusMonths(i);
            
            double interest = paymentService.interest(amount, i);
            double paymentFee = paymentService.paymentFee(amount + interest);
            
            double total = amount + interest + paymentFee;
            
            contract.getInstallments().add(new Installment(date, total));
        }
        
    }
    
}
