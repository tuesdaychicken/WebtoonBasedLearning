package com.comic.quiz;

import org.junit.Test;

import lombok.Data;

public class ShoppingCartTest {

	@Test
    public void shoppingTest() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}

class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount < 10) {
            items[itemCount++] = item;
        } else {
            System.out.println("장바구니에 10개 이상 담겼음 님 더이상 못담으심 어어 못담는다니까");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : "+items[i].getName() + ", 가격 : " + items[i].getPrice() + "원, 합계: " + (items[i].getPrice()*items[i].getQuantity()));
        }
        
        totalPrice();
    }
    
    public void totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("전체 가격 합 : "+totalPrice); 
    }
}

@Data
class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}