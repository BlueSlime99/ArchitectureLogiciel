package domain.tradesman;

import infrastructure.InMemoryPaymentRepository;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.util.Scanner;

public class EventHandler implements PropertyChangeListener {
    PaymentProcess startPaymentProces;
    BillingInformation billingInfo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        {
            System.out.println("Process Payment lunched, please enter your card Information");
            Scanner input = new Scanner(System.in);
            startPaymentProces  = new PaymentProcess(new InMemoryPaymentRepository());
            try {
                billingInfo = new BillingInformation();
                billingInfo.sendBillingInformation(input);
                PaymentId pId = startPaymentProces.handle(billingInfo);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
