package com.dwbook.phonebook.dao;

import com.dwbook.phonebook.dao.mappers.ContactMapper;
import com.dwbook.phonebook.representations.Contact;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface ContactDAO {
    @Mapper(ContactMapper.class)
    @SqlQuery("select * from contact where id = :id")
    Contact getContactById(@Bind("id") int id);


    @GetGeneratedKeys
    @SqlUpdate("insert into contact (id, firstname, lastname, phone) values ( null, :firstname, :lastname, :phone)")
    int createContact(@Bind("firstname") String firstName, @Bind("lastname") String lastName, @Bind("phone") String phone);

}

