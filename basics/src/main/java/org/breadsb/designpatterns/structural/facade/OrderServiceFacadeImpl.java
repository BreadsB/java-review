package org.breadsb.designpatterns.structural.facade;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.productId = productId;
        if (InventoryService.isAvailable(product)) {
            if (ShippingService.checkShipmentAvailability(product)) {
                if (PaymentService.makePayment()) {
                    ShippingService.shipProduct(product);
                    orderFulfilled = true;
                }
            }
        }
        return orderFulfilled;
    }
}
