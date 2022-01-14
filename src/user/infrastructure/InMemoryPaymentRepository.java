package user.infrastructure;

import user.domain.client.UserId;
import user.domain.tradesman.PaymentId;
import user.domain.tradesman.PaymentRepository;
import user.domain.tradesman.PaymentTransaction;
import kernel.NoSuchEntityException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryPaymentRepository implements PaymentRepository {

    private final AtomicInteger count = new AtomicInteger(0);

    private final Map<PaymentId, PaymentTransaction> data = new ConcurrentHashMap<>();


    @Override
    public PaymentId nextIdentity() {
        return new PaymentId(count.incrementAndGet());
    }

    @Override
    public PaymentTransaction findById(PaymentId id) throws NoSuchEntityException {
        final PaymentTransaction transcation = data.get(id);
        if (transcation == null) {
            throw NoSuchEntityException.paymentWithId(id);
        }
        return transcation;
    }

    @Override
    public void add(PaymentTransaction entity) {
    }

    @Override
    public void delete(PaymentId id) {
    }

    @Override
    public UserId currentId() {
        return null;
    }
}