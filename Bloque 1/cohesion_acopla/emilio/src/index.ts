export class Product {
    private id: number
    private name: string
    private price: number
    private discount: number

    constructor(id:number, name:string, price:number){
        this.id = id
        this.name = name
        this.price = price
        this.discount = 0
    }
    setId(id:number){
        this.id = id
    }
    setName(name:string){
        this.name = name
    }
    
    setPrice(price:number){
        this.price = price
    }

    setDiscount(discount:number){
        this.discount = discount
    }

    getId(){
        return this.id
    }

    getName(){
        return this.name
    }

    getPrice(){
        return this.price 

    }

    getDiscount(){
        return this.discount
    }

    applyDiscount(discount:number){
        this.discount = discount
    }

    getPriceWithDiscount(){
        return this.price * (1 - this.discount / 100)
    }



}


interface NotificationService{
    sendNotification(message:string) : void
}

export class EmailNotificationService implements NotificationService{
    sendNotification(message:string){
        console.log(message)
    }

}

export class SMSNotificationService implements NotificationService{
    private phoneNumber: string

    constructor(phoneNumber:string){
        this.phoneNumber = phoneNumber
    }

    sendNotification(message:string){
        console.log(`${message}, mensaje enviado a ${this.phoneNumber}`)
    }

}

export class ShoppingCart{
    private products: Product[]
    private notificationService: NotificationService

    constructor(notificationService: NotificationService){
        this.notificationService = notificationService
        this.products = []
    }

    addProduct(...newProducts:Product[]){
        newProducts.forEach(product => this.products.push(product))
    }

    showProducts(){
        console.log("Compraste: ")
        this.products.forEach((product,index) => {
            if(product.getDiscount()>0){
                console.log(`${index+1}. ${product.getName()}, Precio Original: $ ${product.getPrice()} MXN, Precio con descuento $ ${product.getPriceWithDiscount()} MXN`)
        
            }else{
                console.log(`${index + 1}. ${product.getName()}, por: $ ${product.getPrice} MXN`)
            }
        })
    }

    checkout(){
        this.notificationService.sendNotification('Hola')
        this.showProducts()
    }
}