package com.allandroidprojects.ecomsample.startup;

import java.util.ArrayList;
import java.util.List;

import com.allandroidprojects.ecomsample.R;

public class SearchProduct {

    public final List<Item> productList;

    public SearchProduct()
    {

        productList = new ArrayList<>();

        //offer products;
        productList.add(new Item("Men's Running Shoes Run 100 - GREY", "Discover running at a low price", "₹ 999",
        R.drawable.offer_shoes, "https://contents.mediadecathlon.com/p2174716/1e54ed7fc169abff9480eeca0569ab7b/p2174716.jpg?format=auto&quality=70&f=768x0"));

        productList.add(new Item("Swimming Goggles Xbase Print L Clear Lenses Mike Blue", "Fit all faces with their patented adjustable nose bridge.", "₹ 399",
                R.drawable.offer_goggles, "https://contents.mediadecathlon.com/p1242456/b8430c972daf01c90051f1b265784f5b/p1242456.jpg?format=auto&quality=70&f=768x0"));

        productList.add(new Item("TB SOFT EXTRA BOUNCE CRICKET TENNIS BALL","This cricket tennis ball with an extra bounce and speed off the bat are ideal in all conditions.", "₹ 69",
                R.drawable.offer_ball, "https://contents.mediadecathlon.com/p1996990/9f52ded110287c4b6cda870cdea1d96d/p1996990.jpg?format=auto&quality=70&f=768x0"));


        productList.add(new Item("Hybrid Football FIFA Basic F550 Size 5 - White/Red", "The F550 hybrid has been approved by FIFA for your matches", "₹ 1,099",
                R.drawable.offer_football, "https://contents.mediadecathlon.com/p2154164/73698deddacfd12d401b7b8262b0b948/p2154164.jpg?format=auto&quality=70&f=768x0"));



        // Cricket

        productList.add(new Item("KIDS LIGHTWEIGHT BEGINNER CRICKET HELMET CH 100 JR", "This kids cricket helmet to protect you while you play your first shots against a leather ball.", "₹ 1,499",
                R.drawable.cricket_helmet, "https://contents.mediadecathlon.com/p1979196/59f7a9ed570e0068d7c0e5afb7ad3894/p1979196.jpg?format=auto&quality=70&f=768x0"));

        productList.add(new Item("CRICKET WICKET AND STUMP SET, PLASTIC, YELLOW", "Light weight stump set makes it easy to carry.", "₹ 499",
                R.drawable.cricket_stumps, "https://contents.mediadecathlon.com/p1578644/a652cde4cc2eb95e7746ff9c91791688/p1578644.jpg?format=auto&quality=70&f=768x0"));


        //Football
        productList.add(new Item("Football Shoes Agility 100 HG - Black/White", "The Agility 100 TF with a stabilised sole to help you safely perform your first technical moves on firm pitches.", "₹ 999",
                R.drawable.football_shoes, "https://contents.mediadecathlon.com/p1273543/ba5aa42c20222b13455a62fa6ac81a65/p1273543.jpg?format=auto&quality=70&f=768x0"));



    }// end of constructor




    public List<Item> getProductList(){
        return productList;
    }

}
