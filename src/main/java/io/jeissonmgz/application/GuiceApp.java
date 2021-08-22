package io.jeissonmgz.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.jeissonmgz.configuration.ConfigModule;
import io.jeissonmgz.services.TextService;

public class GuiceApp {

    public static void main (String ...args) {
        System.out.println("Hello world!");
        Injector injector = Guice.createInjector(new ConfigModule());
        TextService textService = injector.getInstance(TextService.class);
        searchText(textService);

    }

    public static void searchText(final TextService textService) {
        String text = "I'm learning Google Guice";
        String textToSearch = "Guice";
        System.out.print("Exist: ".concat(textToSearch).concat(" in ").concat(text). concat(": "));
        System.out.println(textService.existText(text, textToSearch)? "YES" : "NO");
    }
}
