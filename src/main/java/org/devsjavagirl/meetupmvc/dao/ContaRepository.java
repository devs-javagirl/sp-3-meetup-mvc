package org.devsjavagirl.meetupmvc.dao;

import org.devsjavagirl.meetupmvc.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
