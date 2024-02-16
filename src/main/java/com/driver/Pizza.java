package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private boolean cheeseflag = true;
    private boolean toppingflag = true;
    public boolean takeawayflag = true;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            price = 300;
            bill += "Base Price Of The Pizza: 300\n";
        }
        else{
            price = 400;
            bill+= "Base Price Of The Pizza: 400\n";
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseflag) {
            price += 80;
            bill+="Extra Cheese Added: 80\n";
        }
        cheeseflag = false;
    }

    public void addExtraToppings() {
        // your code goes here
        if (toppingflag) {
            if (!isVeg) {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            } else {
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            }
            toppingflag = false;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeawayflag){
            price+=20;
            bill+="Paper bag Price = 20\n";
        }
        takeawayflag = false;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
