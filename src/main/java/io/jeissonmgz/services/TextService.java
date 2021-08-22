package io.jeissonmgz.services;

import java.util.Optional;

public class TextService {

    public boolean existText(String text, String find) {
        return Optional.ofNullable(text)
                .map(a-> a.contains(find))
                .orElse(false);
    }
}
