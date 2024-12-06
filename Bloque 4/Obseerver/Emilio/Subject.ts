import { Observer } from "./Observer";

export class Subject{
    private observers: Map<string,Observer[]> = new Map();

    public addObserver(eventype:string, observer:Observer):void{
        if(!this.observers.has(eventype)){
            this.observers.set(eventype, []);
        }
        this.observers.get(eventype)?.push(observer);

    }

    public removeObserver(eventype: string , observer: Observer):void{
        const observers = this.observers.get(eventype);
        if(observers){
            this.observers.set(
                eventype,
                observers.filter((obs) => obs !== observer)

            );
        }
    }

    public notifyObserver(eventype: string,data:any):void{
        const observers = this.observers.get(eventype);
        if(observers){
            for(const observer of observers){
                observer.update(eventype,data);
            }
        }
    }

}