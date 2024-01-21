package com.batch.persistences;

import com.batch.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonDao extends CrudRepository<Person, Long> {
}
