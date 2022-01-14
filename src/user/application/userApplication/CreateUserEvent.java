package user.application.userApplication;


import kernel.ApplicationEvent;
import user.domain.client.UserId;

public class CreateUserEvent implements ApplicationEvent {
    private final UserId userId;

    public CreateUserEvent(UserId userId) {
        this.userId = userId;
    }
}