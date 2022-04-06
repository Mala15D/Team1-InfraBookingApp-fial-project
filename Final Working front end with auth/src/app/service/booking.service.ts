import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Booking } from 'src/model/Booking';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private booking:Booking[]=[]
  constructor(private http:HttpClient) { }
  getAllBookings(){
    return this.http.get<Booking[]>('http://localhost:9051/booking'); 

  }
  getBookingbyId(id:number){
    return this.http.get<Booking[]>('http://localhost:9051/booking/'+id); 
  }
}
