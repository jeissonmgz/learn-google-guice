package io.jeissonmgz.services;

import com.google.inject.Inject;

public class CompareService {

    @Inject
    private PrintService printService;

    public void compareInstances(Object o1, Object o2) {
        printService.print("Instaces "
                .concat(o1.toString())
                .concat(" with ")
                .concat(o2.toString()
                .concat(" are ")
                .concat(o1.equals(o2)? "EQUALS" : "DIFFERENTS")));
    }

}
