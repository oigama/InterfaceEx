package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        contract.getInstallments().add(new Installment(LocalDate.of(2024,7,25), 206.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2024,8,25), 208.08));

    }


}
