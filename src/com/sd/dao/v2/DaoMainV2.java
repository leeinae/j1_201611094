package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2 {
    public static void main(String args[]){
        PersonDAOImpl personDAOImpl = new PersonDAOImpl();
        PersonVO person = new PersonVO();

        person.setName("js1");
        person.setAddress("1 Hongji-dong");
        personDAOImpl.insert(person);

        person.setName("js2");
        person.setAddress("2 Hongji-dong");
        personDAOImpl.insert(person);

        List persons=personDAOImpl.findAll();
        Iterator iter=persons.iterator();
        while(iter.hasNext()) {
            person=(PersonVO)iter.next();
            System.out.println(person.toString());
        }

        personDAOImpl.delete(1);

        person.setId(2);
        person.setName("js2 updated");
        person.setAddress("2 Hongji-dong updated");
        personDAOImpl.update(person);

        person=personDAOImpl.findById(2);
        System.out.println("found by id..."+person);

        personDAOImpl.close();
    }
}