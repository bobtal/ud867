package com.example.jokewizard;

import com.example.javajokes.JokeSmith;

public class JokeWizard {
    public String getJoke() {
        JokeSmith smith = new JokeSmith();
        return smith.getJoke() + "\n - This is from the JokeWizard module";
    }
}
