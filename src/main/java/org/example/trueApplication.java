package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import model.Transaction;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.MappedTypes;
import org.example.health.ApplicationHealthCheck;


import org.example.resources.TransactionResource;
import org.mybatis.spring.annotation.MapperScan;

import java.io.InputStream;

@MappedTypes(Transaction.class)
@MapperScan("mapper")
public class trueApplication extends Application<trueConfiguration> {

    public static void main(final String[] args) throws Exception {
        new trueApplication().run("server", "config.yml");
    }

    @Override
    public void initialize(final Bootstrap<trueConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(trueConfiguration configuration,
                    Environment environment) throws Exception{

        environment.jersey().register(new TransactionResource());
        environment.healthChecks().register("application", new ApplicationHealthCheck());
    }

}
