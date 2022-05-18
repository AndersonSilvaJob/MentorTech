package com.web.tornese.SpringWeb.repositorio;

import com.web.tornese.SpringWeb.models.Mentor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MentoresRepo extends CrudRepository<Mentor, Integer> {
    @Query(value="select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from mentores where id = :id", nativeQuery = true)
    public boolean exist(int id);
  
    @Query(value="select * from mentores where email_mentor = :emailMentor and senha_mentor = :senhaMentor", nativeQuery = true)
    public Mentor Login(String emailMentor, String senhaMentor);
}