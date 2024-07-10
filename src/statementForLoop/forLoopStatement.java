package statementForLoop;

public class forLoopStatement {
    public static void main(String[] args) {
        int countPrimeNumbers = 0;
        //Haciendo uso de la sentencia for para checar los primeros 1000 numeros
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("The number " + i + " is a prime number");
                countPrimeNumbers++;
                if (countPrimeNumbers == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
