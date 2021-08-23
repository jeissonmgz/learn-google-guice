package io.jeissonmgz.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.jeissonmgz.configuration.ConfigModule;
import io.jeissonmgz.services.PrintService;
import io.jeissonmgz.services.TextService;

public class GuiceApp {

    public static void main (String ...args) {
        System.out.println("Hello world!");
        Injector injector = Guice.createInjector(new ConfigModule());
        TextService textService = injector.getInstance(TextService.class);
        TextService textService2 = injector.getInstance(TextService.class);
        PrintService printService = injector.getInstance(PrintService.class);
        PrintService printService2 = injector.getInstance(PrintService.class);
        searchText(textService, printService);
        compareInstanceDifferents(printService, printService, printService2);
        compareInstanceDifferents(printService, textService, textService2);

    }

    public static void searchText(final TextService textService, PrintService printService) {
        String text = "I'm learning Google Guice";
        String textToSearch = "Guice";
        printService.print("Exist: ".concat(textToSearch).concat(" in ").concat(text). concat(": "));
        printService.print(textService.existText(text, textToSearch)? "YES" : "NO");
    }

    public static void compareInstanceDifferents(PrintService printService, Object o1, Object o2) {
        printService.print("Diferents: Instacia 1 ".concat(o1.toString()).concat(" with ").concat(o2.toString()));
    }
}
