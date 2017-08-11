package service.impl;

import service.Quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }


    public void embark() {
            stream.println("hello>>>>>>>");
        }
}
