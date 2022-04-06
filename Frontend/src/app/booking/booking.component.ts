import { Component, OnInit } from '@angular/core';
import { Booking } from 'src/model/Booking';
import { Employee } from 'src/model/Employee';
import { BookingService } from '../service/booking.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  booking:Booking[]=[]
  stack:Employee[]=[]
  showOrNot:boolean=false;
  showOrNot2:boolean=false;
  constructor(private service:BookingService) {
    this.loadBooking();
   }
   loadBooking() {
    this.service.getAllBookings().subscribe(success => this.booking = success);
   }

   getAllBooking(){
     this.showOrNot2=true;
     this.service.getAllBookings().subscribe(s=>console.log(s))
   }
  
   getBookingbyId(id:number){
     if(id>0 && id<4)
     {
      this.service.getBookingbyId(id).subscribe(s=>{
       
        this.showOrNot=true;
      })
     }
     else{
       alert("Invalid user id")
     }
   }
  ngOnInit() {
  }

}
