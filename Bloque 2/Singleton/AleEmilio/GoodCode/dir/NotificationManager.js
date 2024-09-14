"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NotificationManager = void 0;
class NotificationManager {
    constructor() {
        this.notificationHistory = [];
    }
    static getInstance() {
        if (!NotificationManager.instance) {
            NotificationManager.instance = new NotificationManager();
        }
        return NotificationManager.instance;
    }
    sendNotification(message, notifier) {
        notifier.sendNotification(message);
        this.notificationHistory.push({ msg: message, type: notifier.constructor.name });
    }
    getNotificationHistory() {
        return this.notificationHistory;
    }
}
exports.NotificationManager = NotificationManager;
