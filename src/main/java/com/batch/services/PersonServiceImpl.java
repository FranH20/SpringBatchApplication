package com.batch.services;

import com.batch.entities.Person;
import com.batch.persistences.IPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService{

    @Autowired
    private IPersonDao personDao;

    @Override
    @Transactional
    public void saveAll(List<Person> personList) {
        personDao.saveAll(personList);
    }
}
