package com.apps.onetwoone.repository;


import com.apps.onetwoone.model.Architecture;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ArchitectureRepository extends SimpleJpaRepository<Architecture, String> {
    private final EntityManager em;
    public ArchitectureRepository(EntityManager em) {
        super(Architecture.class, em);
        this.em = em;
    }
    @Override
    public List<Architecture> findAll() {
        return em.createNativeQuery("Select * from \"useruploadonetoonev2\".\"Architecture\"", Architecture.class).getResultList();
    }
}