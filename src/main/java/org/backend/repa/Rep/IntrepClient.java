package org.backend.repa.Rep;

import org.backend.repa.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntrepClient extends JpaRepository<Client,Long> {

}
