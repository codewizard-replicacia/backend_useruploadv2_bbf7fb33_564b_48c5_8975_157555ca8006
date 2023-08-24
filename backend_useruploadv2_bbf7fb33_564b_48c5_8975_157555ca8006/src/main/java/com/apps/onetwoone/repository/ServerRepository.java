package com.apps.onetwoone.repository;


import com.apps.onetwoone.model.Server;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ServerRepository extends SimpleJpaRepository<Server, String> {
    private final EntityManager em;
    public ServerRepository(EntityManager em) {
        super(Server.class, em);
        this.em = em;
    }
    @Override
    public List<Server> findAll() {
        return em.createNativeQuery("Select * from \"useruploadonetoonev2\".\"Server\"", Server.class).getResultList();
    }
}