import { Product,EmailNotificationService,SMSNotificationService, ShoppingCart } from ".";

const mouse = new Product(1, 'Mouse',500)
const laptop = new Product(2, 'Laptop',500)
const monitor = new Product(3, 'Monitor',500)

const cart = new ShoppingCart(new EmailNotificationService)
const cart2 = new ShoppingCart(new SMSNotificationService('923-676-8888'))

cart.addProduct(mouse,laptop,monitor)
cart.checkout()
console.log("")
monitor.applyDiscount(10)
console.log("")
cart2.addProduct(mouse,monitor)
cart2.checkout()