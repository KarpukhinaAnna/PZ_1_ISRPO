package com.company;
class Variables {
    public static void gipotenuza() {

        double a = 3;
        double b = 4;
        double c;

        c = Math.sqrt(a * a + b * b);
        System.out.println("c = " + c);
    }
}
class Main
    {
        public static void main(String args[])
        {
            Variables var = new Variables();
            var.gipotenuza();
        }
    }

