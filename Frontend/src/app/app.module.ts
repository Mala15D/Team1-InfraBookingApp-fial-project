import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { BookingComponent } from './booking/booking.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { MenuComponent } from './menu/menu.component';
import { FooterComponent } from './footer/footer.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';

const routes:Routes=[
  {path:"login", component:LoginComponent},
  {path:"booking",component:BookingComponent},
  {path:"register",component:RegisterComponent},
  {path:"home",redirectTo: ""},
  {path:"",component:HomeComponent},
  {path:"**",component:NotfoundComponent},
  {path:"menu",component:MenuComponent},
  {path:"footer",component:FooterComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    BookingComponent,
    LoginComponent,
    RegisterComponent,
    MenuComponent,
    FooterComponent,
    NotfoundComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
