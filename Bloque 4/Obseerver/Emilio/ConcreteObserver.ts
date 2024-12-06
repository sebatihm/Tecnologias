import { Observer } from "./Observer";
export class ConcreteObserver implements Observer{
    private name: string;

    constructor(name: string){
        this.name = name;
    }

    public update(data:any){
        console.log(`${this.name} recibio la actualizacion`, data);
    }
}
