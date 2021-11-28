package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainerOldest = trainers.get(0);
        for (Trainer trainer: trainers) {
            if (trainer.getAge() > trainerOldest.getAge()) {
                trainerOldest = trainer;
            }
        }
        return trainerOldest;
    }
}
