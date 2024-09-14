import { INotification } from "./INotification";

export class EmailNotification implements INotification{
    private email: string;

    constructor(email: string){
        this.email = email;
    }

    sendNotification(message: String): void {
        console.log(`Sending notification via email: ${message} to ${this.email}`);
    }
}