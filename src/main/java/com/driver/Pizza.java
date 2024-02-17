package com.driver;

public class Pizza {


    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isExtreCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtreCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;

        this.price = isVeg ? 300 : 400;
        this.toppings = isVeg ? 70 : 120;
        this.cheese = 80;
        this.bill = "Base Price of The Pizza: " + this.price+ "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtreCheeseAdded) {
            this.price += this.cheese;
            isExtreCheeseAdded = true;
        }

    }

    public void addExtraToppings() {
        // your code goes here
        if (!isExtraToppingsAdded) {
           this.price+=this.toppings;
           isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price+=20;
            isTakeAwayAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isExtreCheeseAdded){
                this.bill+="Extra Cheese Added: "+ this.cheese + "\n";
            }
            if(isExtraToppingsAdded){
                this.bill+="Extra Toppings Added: "+ this.toppings + "\n";
            }
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: "+ 20 + "\n";
            }
            this.bill+="Total Price: "+ this.price +"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
