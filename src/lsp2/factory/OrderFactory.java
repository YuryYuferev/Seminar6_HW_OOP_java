package src.lsp2.factory;

import src.lsp2.model.Order;
import src.lsp2.model.OrderBonus;
public class OrderFactory {
    public Order create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}