package service;

import archi.domain.client.UserId;
import archi.exception.NoSuchEntityException;

public interface Repository<VOID, E> {
    VOID nextIdentity();

    E findById(VOID id) throws NoSuchEntityException;

    void add(E entity);

    void delete(VOID id);

    UserId currentId();
}