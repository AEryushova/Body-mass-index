public class BmiService {
    public float calculate(float growth, float theWeight) {
        return (theWeight / (growth * growth));
    }
}
