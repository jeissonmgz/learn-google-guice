package io.jeissonmgz.configuration;

import com.google.inject.AbstractModule;
import io.jeissonmgz.services.TextService;

public class ConfigModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TextService.class);
    }
}
