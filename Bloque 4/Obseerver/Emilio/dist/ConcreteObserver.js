"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ConcreteObserver = void 0;
class ConcreteObserver {
    constructor(name) {
        this.name = name;
    }
    update(data) {
        console.log(`${this.name} recibio la actualizacion`, data);
    }
}
exports.ConcreteObserver = ConcreteObserver;
