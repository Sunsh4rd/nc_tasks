package main;

import main.NotNegative;

public class Rating {

    @NotNegative
    private float score;

    public Rating(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "main.Rating{" +
                "score=" + score +
                '}';
    }
}
