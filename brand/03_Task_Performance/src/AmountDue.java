class AmountDue {
    
    double computeAmountDue(double price) {
        return price + (price * 0.12);
    }
    
    double computeAmountDue(double price, int quantity) {
        double total = price * quantity;
        return total + (total * 0.12);
    }
    
    double computeAmountDue(double price, int quantity, double discount) {
        double total = (price * quantity) - discount;
        return total + (total * 0.12);
    }
}
