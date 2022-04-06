import { Role } from "./Role";

export class Employee{
    constructor(public id:number,public userName:string,public password:string,public roles:Role[]){
    }
}