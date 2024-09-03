"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ShoppingCart = exports.SMSNotificationService = exports.EmailNotificationService = exports.Product = void 0;
class Product {
    constructor(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = 0;
    }
    setId(id) {
        this.id = id;
    }
    setName(name) {
        this.name = name;
    }
    setPrice(price) {
        this.price = price;
    }
    setDiscount(discount) {
        this.discount = discount;
    }
    getId() {
        return this.id;
    }
    getName() {
        return this.name;
    }
    getPrice() {
        return this.price;
    }
    getDiscount() {
        return this.discount;
    }
    applyDiscount(discount) {
        this.discount = discount;
    }
    getPriceWithDiscount() {
        return this.price * (1 - this.discount / 100);
    }
}
exports.Product = Product;
class EmailNotificationService {
    sendNotification(message) {
        console.log(message);
    }
}
exports.EmailNotificationService = EmailNotificationService;
class SMSNotificationService {
    constructor(phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    sendNotification(message) {
        console.log(`${message}, mensaje enviado a ${this.phoneNumber}`);
    }
}
exports.SMSNotificationService = SMSNotificationService;
class ShoppingCart {
    constructor(notificationService) {
        this.notificationService = notificationService;
        this.products = [];
    }
    addProduct(...newProducts) {
        newProducts.forEach(product => this.products.push(product));
    }
    showProducts() {
        console.log("Compraste: ");
        this.products.forEach((product, index) => {
            if (product.getDiscount() > 0) {
                console.log(`${index + 1}. ${product.getName()}, Precio Original: $ ${product.getPrice()} MXN, Precio con descuento $ ${product.getPriceWithDiscount()} MXN`);
            }
            else {
                console.log(`${index + 1}. ${product.getName()}, por: $ ${product.getPrice} MXN`);
            }
        });
    }
    checkout() {
        this.notificationService.sendNotification('Hola');
        this.showProducts();
    }
}
exports.ShoppingCart = ShoppingCart;
