package com.driver;

public class Main {

    public static void main(String[] args)
    {
        Product p = new Product();
        int res = p.product(1,2);
        int res2 = p.product(1,2,3);
        double res3 = p.product(1.2,1.8);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }


    public static class Product{
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }
}