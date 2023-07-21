package br.gov.mds.sisConferencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mds.sisConferencia.models.Orgao;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgaoRepository extends JpaRepository<Orgao, Long> {

}
