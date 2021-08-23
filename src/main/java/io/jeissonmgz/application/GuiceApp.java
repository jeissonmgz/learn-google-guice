package io.jeissonmgz.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.jeissonmgz.configuration.ConfigModule;
import io.jeissonmgz.services.CompareService;
import io.jeissonmgz.services.PrintService;
import io.jeissonmgz.services.TextService;

public class GuiceApp {

    public static void main (String ...args) {
        System.out.println("Hello world!");
        Injector injector = Guice.createInjector(new ConfigModule());
        TextService textService = injector.getInstance(TextService.class);
        TextService textService2 = injector.getInstance(TextService.class);
        PrintService printService = injector.getInstance(PrintService.class);
        CompareService compareService = injector.getInstance(CompareService.class);
        CompareService compareService2 = injector.getInstance(CompareService.class);
        searchText(textService, printService);
        compareService.compareInstances(textService, textService2);
        compareService.compareInstances(compareService, compareService2);

    }

    public static void searchText(final TextService textService, PrintService printService) {
        String text = "I'm learning Google Guice";
        String textToSearch = "Guice";
        printService.print("Exist: ".concat(textToSearch).concat(" in ").concat(text). concat(": "));
        printService.print(textService.existText(text, textToSearch)? "YES" : "NO");
    }
}
