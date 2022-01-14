package user.application.userApplication;

import kernel.Command;

public interface RegistrationHandlerService<C extends Command, R> {
    R handle(C command);
}