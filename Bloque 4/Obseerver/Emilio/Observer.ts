export interface Observer{
    update(eventype: string, data:any): void;
}