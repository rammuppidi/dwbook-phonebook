package com.dwbook.phonebook;

import com.dwbook.phonebook.dao.ContactDAO;
import com.dwbook.phonebook.resources.ContactResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App extends Application<PhonebookConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    @Override
    public  void initialize(Bootstrap<PhonebookConfiguration> b)
    {

    }

    @Override
    public void run( PhonebookConfiguration c, Environment e) throws Exception
    {
           LOGGER.info("Method App#run() called");
           System.out.println(c.getAdditionalMessage());
           for (int i = 0; i < c.getMessageRepetitions(); i++){
              System.out.println(c.getMessage());
           }

           final DBIFactory factory = new DBIFactory();
           final DBI jdbi = factory.build(e, c.getDataSourceFactory(),"mysql");
           jdbi.onDemand(ContactDAO.class);
           e.jersey().register(new ContactResource(jdbi));
        LOGGER.info("DAO Registered");
    }

    public static void main(String args[]) throws Exception
    {
        new App().run(args);
    }
}
