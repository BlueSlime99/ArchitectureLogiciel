package domain.tradesman;

import service.Command;

import java.text.ParseException;
import java.util.Scanner;

public class BillingInformation implements Command {

    private long cardNumber;
    private String cardOwner;
    private int threeDigit;

    public BillingInformation() {
    }

    public BillingInformation sendBillingInformation(Scanner input) throws ParseException {

        BillingInformation billinginfo = new BillingInformation();
        System.out.println("enter card Number");
        long cardNumber = input.nextLong();
        System.out.println("enter threedigit code");
        int threeDigit = input.nextInt();
        System.out.println("enter Name Owner");
        String cardOwner = input.nextLine();
        input.nextLine();

        billinginfo.cardNumber = cardNumber;
        billinginfo.cardOwner = cardOwner;
        billinginfo.threeDigit = threeDigit;

        return billinginfo;
    }


    public long getCardNumber() {
        return cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public int getThreeDigit() {
        return threeDigit;
    }


}
