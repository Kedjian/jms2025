package dev.lpa;

interface Playable {
    String play();
}

class Football implements Playable {

    public Football() {}

    @Override
    public String play() {
        return "Football is being played.";
    }
}

class Volleyball implements Playable {

    public Volleyball() {}

    @Override
    public String play() {
        return "Volleyball is being played, " +
                "and it is far better than football.";
    }
}

class Basketball implements Playable {

    public Basketball() {}

    @Override
    public String play() {
        return "Basketball is being played, " +
                "and frankly, it is mid.";
    }
}



