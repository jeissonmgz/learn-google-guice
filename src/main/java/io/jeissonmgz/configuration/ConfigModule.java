package io.jeissonmgz.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import io.jeissonmgz.services.CompareService;
import io.jeissonmgz.services.PrintService;
import io.jeissonmgz.services.PrintServiceImpl;
import io.jeissonmgz.services.TextService;

public class ConfigModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TextService.class);
        bind(PrintService.class).to(PrintServiceImpl.class);
        //bind(CompareService.class).in(Singleton.class);
        //bind(CompareService.class).in(Scopes.SINGLETON);
        bind(CompareService.class).toInstance(new CompareService());
    }
}
