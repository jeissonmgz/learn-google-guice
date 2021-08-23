package io.jeissonmgz.services;

import com.google.inject.Singleton;

import java.util.Optional;

@Singleton
public class TextService {

    public boolean existText(String text, String find) {
        return Optional.ofNullable(text)
                .map(a-> a.contains(find))
                .orElse(false);
    }
}
