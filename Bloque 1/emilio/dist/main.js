"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const _1 = require(".");
const mouse = new _1.Product(1, 'Mouse', 500);
const laptop = new _1.Product(2, 'Laptop', 500);
const monitor = new _1.Product(3, 'Monitor', 500);
const cart = new _1.ShoppingCart(new _1.EmailNotificationService);
const cart2 = new _1.ShoppingCart(new _1.SMSNotificationService('923-676-8888'));
cart.addProduct(mouse, laptop, monitor);
cart.checkout();
console.log("");
monitor.applyDiscount(10);
console.log("");
cart2.addProduct(mouse, monitor);
cart2.checkout();
