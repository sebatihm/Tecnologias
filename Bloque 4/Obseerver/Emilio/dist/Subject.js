"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Subject = void 0;
class Subject {
    constructor() {
        this.observers = new Map();
    }
    addObserver(eventype, observer) {
        var _a;
        if (!this.observers.has(eventype)) {
            this.observers.set(eventype, []);
        }
        (_a = this.observers.get(eventype)) === null || _a === void 0 ? void 0 : _a.push(observer);
    }
    removeObserver(eventype, observer) {
        const observers = this.observers.get(eventype);
        if (observers) {
            this.observers.set(eventype, observers.filter((obs) => obs !== observer));
        }
    }
    notifyObserver(eventype, data) {
        const observers = this.observers.get(eventype);
        if (observers) {
            for (const observer of observers) {
                observer.update(eventype, data);
            }
        }
    }
}
exports.Subject = Subject;
