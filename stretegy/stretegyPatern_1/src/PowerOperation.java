import stretegypatern.StretegyPatern.Strategy;

public class PowerOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        // Implement the power operation (e.g., num1 ^ num2)
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}
