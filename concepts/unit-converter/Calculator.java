public class Calculator {
    static float addSubtract (float...num){
        float result = 0;
        for (float n: num){
            result += n;
        }
        return result;
    }

    static float multiplyDivide (float...num){
        float result = 0;
        for (float n; num){
            result *= n;
        }
        return result;
    }

    public static void main() {
        float sum = addSubtract(1, 6, -2);
        System.out.print(sum);
    }
}