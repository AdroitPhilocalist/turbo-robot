public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, -2, 3, 6, 8, 9, 4};

        // Testing Square Root Decomposition RMQ
        RangeMinimumQuerySQRT rmqSqrt = new RangeMinimumQuerySQRT(arr);
        System.out.println("Square Root RMQ - Minimum in range (1, 5): " + rmqSqrt.query(1, 5));
        rmqSqrt.update(3, -5);
        System.out.println("Square Root RMQ - Minimum in range (1, 5) after update: " + rmqSqrt.query(1, 5));

        // Testing Sparse Table RMQ
        RangeMinimumQuerySparseTable rmqSparse = new RangeMinimumQuerySparseTable(arr);
        System.out.println("Sparse Table RMQ - Minimum in range (1, 5): " + rmqSparse.query(1, 5));
    }
}
