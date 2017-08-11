package service.impl;

import service.Knight;
import service.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    public void embarkOnQuest() {
        quest.embark();
    }
}
