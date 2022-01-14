package user.domain.tradesman;

import user.application.paymentApplication.PaymentHandlerService;

public class PaymentProcess implements PaymentHandlerService<BillingInformation, PaymentId> {
    PaymentRepository paymentRepository ;

    public PaymentProcess(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }



    @Override
    public PaymentId handle(BillingInformation billingInfo) {
        final PaymentId paymentId = paymentRepository.nextIdentity();
        PaymentTransaction transaction = new PaymentTransaction(paymentId, billingInfo.getCardNumber(), billingInfo.getCardOwner(), billingInfo.getThreeDigit());
        paymentRepository.add(transaction);
        System.out.println("Process Payment Done! Welcome On Board!");
        return paymentId;
    }
}
