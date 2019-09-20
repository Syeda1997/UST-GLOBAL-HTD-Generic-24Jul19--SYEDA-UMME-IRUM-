import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';//importing router module
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './users/users.component';
import { PageNotfoundComponent } from './page-notfound/page-notfound.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    RegisterComponent,
    UsersComponent,
    PageNotfoundComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component:HomeComponent},//declaring path routing
      { path: 'about', component:AboutComponent},
      { path: 'register', component:RegisterComponent},
      { path: 'users' , component:UsersComponent},
      { path: '**', component:PageNotfoundComponent}//** is used to get error if garbage url is added or searched
    ]),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
