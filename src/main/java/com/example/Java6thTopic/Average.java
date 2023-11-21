package com.example.Java6thTopic;

import java.util.List;

public class Average {

    private final List<Parson> members;
    private final AverageText averageText;

    public Average(List<Parson> members, com.example.Java6thTopic.AverageText averageText) {
        this.members = members;
        this.averageText = averageText;
    }

    public List<Parson> getMembers() {
        return members;
    }

    public com.example.Java6thTopic.AverageText getAverageText() {
        return averageText;
    }
}