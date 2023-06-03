package com.matchink.api.Repository;

import com.matchink.api.Model.Estudio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends MongoRepository<Estudio, String> {
}
