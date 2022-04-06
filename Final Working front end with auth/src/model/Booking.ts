import { Employee } from "./Employee";
import { Room } from "./Room";

export class Booking {
    constructor(public bookedRooms: Room[], public stakeholder: Employee[], public bookingId: number, public purpose: string, public dateOfBooking: string, public participants: number) {
    }
}