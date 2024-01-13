package com.comic.quiz;
import java.util.Scanner;

import org.junit.Test;
public class ProductOrderMain2 {
	
	@Test
	public void productTest() {

	int total;
	
	int orderNum = 0;
	String productName;
	int price;
	int quantity;
	
	Scanner sc = new Scanner(System.in);

	System.out.printf("입력할 주문의 개수를 입력하세요 : ");

	orderNum = sc.nextInt();
	
	ProductOrder[] pro = new ProductOrder[orderNum];
	
	for(int num = 0; num <orderNum; num++) {
		System.out.println(num+1 +"번째 주문 정보를 입력하세요.");
		System.out.printf("상품명: ");
		productName = sc.next();
		System.out.printf("가격: ");
		price = sc.nextInt();
		System.out.printf("수량: ");
		quantity = sc.nextInt();
		
		pro[num] = createOrder(productName, price, quantity);
	}
	
	
	printOders(pro);
	
	total = getTotalAmount(pro);
	
	System.out.println("총 주문액: " + total);
	}
	
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder productOrder = new ProductOrder();
		
		productOrder.productName = productName;
		productOrder.price = price;
		productOrder.quantity = quantity;
		
		return productOrder;
	}
	
	static void printOders(ProductOrder[] orders) {
		
		for(ProductOrder product : orders) {
			
			System.out.println("상품: " + product.productName +
					 ", 가격: " + product.price +
					 ", 수량: " + product.quantity);
		}
	}
	
	static int getTotalAmount(ProductOrder[] orders) {
		int total = 0;
		
		for(ProductOrder product : orders) {
			
			if(product.quantity > 1) {
				product.price = product.price * 2;
			}
			total += product.price;
		}
		return total;
	}
	
}

class ProductOrder {
	String productName;
	int price;
	int quantity;
}