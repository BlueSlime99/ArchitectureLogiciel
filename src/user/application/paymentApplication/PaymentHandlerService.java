package user.application.paymentApplication;

import kernel.Command;

public interface PaymentHandlerService <C extends Command, R> {
    R handle(C command);

}
