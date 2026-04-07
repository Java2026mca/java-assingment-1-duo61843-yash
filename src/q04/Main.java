public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n && sc.hasNextInt(); i++) {
        int num = sc.nextInt();

        boolean prime = isPrime(num);
        boolean perfect = isPerfect(num);

        if (prime && perfect) {
            System.out.println("Both");
        } else if (prime) {
            System.out.println("Prime");
        } else if (perfect) {
            System.out.println("Perfect");
        } else {
            System.out.println("Neither");
        }
    }

    sc.close(); 
}
