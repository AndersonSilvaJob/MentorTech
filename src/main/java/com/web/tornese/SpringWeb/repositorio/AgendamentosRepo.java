package com.web.tornese.SpringWeb.repositorio;

import com.web.tornese.SpringWeb.models.Agendamento;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AgendamentosRepo extends CrudRepository<Agendamento, Integer> {
    @Query(value="select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from agendamentos where mentor_id_mentor  = :mentor", nativeQuery = true)
   public boolean exist(int mentor);
  
  //  @Query(value="select * from agendamentos where mentor_id_mentor = :mentor and senha_mentor = :senhaMentor", nativeQuery = true)
    //public Mentor Login(String emailMentor, String senhaMentor);
}