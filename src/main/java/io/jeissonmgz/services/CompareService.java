package io.jeissonmgz.services;

public class CompareService {

    public void compareInstances(PrintService printService, Object o1, Object o2) {
        printService.print("Instaces "
                .concat(o1.toString())
                .concat(" with ")
                .concat(o2.toString()
                .concat(" are ")
                .concat(o1.equals(o2)? "EQUALS" : "DIFFERENTS")));
    }

}
