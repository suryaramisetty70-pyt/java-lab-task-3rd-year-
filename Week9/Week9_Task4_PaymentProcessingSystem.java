public class Week9_Task4_PaymentProcessingSystem {
    interface Payment {
        void pay(double amount);
        double getFeeRate();
        String getName();
    }

    static class CreditCardPayment implements Payment {
        public void pay(double amount) {}

        public double getFeeRate() {
            return 0.02;
        }

        public String getName() {
            return "CreditCard";
        }
    }

    static class UPIPayment implements Payment {
        public void pay(double amount) {}

        public double getFeeRate() {
            return 0.01;
        }

        public String getName() {
            return "UPI";
        }
    }

    static class NetBankingPayment implements Payment {
        public void pay(double amount) {}

        public double getFeeRate() {
            return 0.015;
        }

        public String getName() {
            return "NetBanking";
        }
    }

    abstract static class PaymentProcessor {
        abstract double processPayment(Payment payment, double amount);
    }

    static class OnlinePaymentProcessor extends PaymentProcessor {
        @Override
        public double processPayment(Payment payment, double amount) {
            payment.pay(amount);
            return amount * (1.0 + payment.getFeeRate());
        }
    }

    public static void main(String[] args) {
        OnlinePaymentProcessor processor = new OnlinePaymentProcessor();

        Payment p1 = new CreditCardPayment();
        double amt1 = 1000;
        System.out.printf("%s %.2f\n", p1.getName(), processor.processPayment(p1, amt1));

        Payment p2 = new UPIPayment();
        double amt2 = 2000;
        System.out.printf("%s %.2f\n", p2.getName(), processor.processPayment(p2, amt2));

        Payment p3 = new NetBankingPayment();
        double amt3 = 5000;
        System.out.printf("%s %.2f\n", p3.getName(), processor.processPayment(p3, amt3));
    }
}

/*
OUTPUT:
CreditCard 1020.00
UPI 2020.00
NetBanking 5075.00
*/
