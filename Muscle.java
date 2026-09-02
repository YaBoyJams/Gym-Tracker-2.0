
/**
 * The user will select a specific muscle hit making reference to the MuscleGroup enum,
 * each muscle will be related to a specific MuscleGroup e.g. biceps -> arms, etc
 */

public enum Muscle {

    BICEPS(MuscleGroup.ARMS),
    TRICEPS(MuscleGroup.ARMS),
    FOREARMS(MuscleGroup.ARMS),
    OTHER_ARMS(MuscleGroup.ARMS),
    FRONT_DELTS(MuscleGroup.SHOULDERS),
    SIDE_DELTS(MuscleGroup.SHOULDERS),
    REAR_DELTS(MuscleGroup.SHOULDERS),
    OTHER_SHOULDERS(MuscleGroup.SHOULDERS),
    UPPER_CHEST(MuscleGroup.CHEST),
    MID_CHEST(MuscleGroup.CHEST),
    LOWER_CHEST(MuscleGroup.CHEST),
    OTHER_CHEST(MuscleGroup.CHEST),
    LATS(MuscleGroup.BACK),
    TRAPS(MuscleGroup.BACK),
    MID_BACK(MuscleGroup.BACK),
    LOWER_BACK(MuscleGroup.BACK),
    OTHER_BACK(MuscleGroup.BACK),
    QUADS(MuscleGroup.LEGS),
    HAMSTRINGS(MuscleGroup.LEGS),
    CALVES(MuscleGroup.LEGS),
    GLUTES(MuscleGroup.LEGS),
    ADDUCTORS(MuscleGroup.LEGS),
    OTHER_LEGS(MuscleGroup.LEGS),
    ABS(MuscleGroup.CORE),
    OBLIQUES(MuscleGroup.CORE),
    OTHER_CORE(MuscleGroup.CORE),
    OTHER(MuscleGroup.OTHER),

    private final MuscleGroup muscleGroup;

    Muscle(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

}
