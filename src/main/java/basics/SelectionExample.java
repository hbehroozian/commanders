package basics;

public class SelectionExample {
    public static void main(String[] args) {




        // if the price is more 500, then add 5% discount
        // if the price is more than 300 and it's a member, then add 5% for price

        // if age is above 65, then add 2% discount

        // if a member add 3% additional on top of the other discounts
        // (this will be applied to the total after other discounts are applied)


        boolean isMember = true;
        int age = 65;
        double price = 301;
        double discountAmount = 0; //?

        if(price > 500 || (price > 300 && isMember)) {
            discountAmount += price * 0.05;
        }

        System.out.println("after 1 Discount Amount: " + discountAmount);

        if(age > 65){
            discountAmount += price * 0.02; // price*2/100
        }

        System.out.println("after 2 Discount Amount: " + discountAmount);
        if(isMember){
            discountAmount += (price - discountAmount) * 0.03;
        }

        System.out.println("after 3 Discount Amount: " + discountAmount);
        System.out.println("Total after discount: " + (price - discountAmount));

    }
}
