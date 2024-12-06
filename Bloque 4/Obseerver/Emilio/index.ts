import { Subject } from "./Subject";
import { ConcreteObserver } from "./ConcreteObserver";

const subject = new Subject();

const observer1 = new ConcreteObserver("Observer1");
const observer2 = new ConcreteObserver("Observer2");
const observer3 = new ConcreteObserver("Observer3");
const observer4 = new ConcreteObserver("Observer4");


subject.addObserver("eventoA",observer1);
subject.addObserver("eventoA",observer2);
subject.addObserver("eventoB",observer2);
subject.addObserver("eventoB",observer3);
subject.addObserver("eventoC",observer4);

subject.notifyObserver("eventoA", {message: "Notificacion para evento A"});
subject.notifyObserver("eventoB", {message: "Notificacion para evento B"});
subject.notifyObserver("eventoC", {message: "Notificacion para evento C"});

subject.removeObserver("eventoA",observer1);

console.log(" ")
console.log("Notificaciones despues de eliminar al observador 1");

subject.notifyObserver("eventoA", {message: "Nueva notificacion para evento A"});
subject.notifyObserver("eventoB", {message: "Nueva notificacion para evento B"});
subject.notifyObserver("eventoC", {message: "Nueva notificacion para evento C"});

