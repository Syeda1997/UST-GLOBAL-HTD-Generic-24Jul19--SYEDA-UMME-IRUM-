import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { GithubComponent } from './github/github.component';
import { JsonplaceholderComponent } from './jsonplaceholder/jsonplaceholder.component';
import { CarfirebaseComponent } from './carfirebase/carfirebase.component';
import { CarsComponent } from './cars/cars.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    GithubComponent,
    JsonplaceholderComponent,
    CarfirebaseComponent,
    CarsComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot ([
      {path: '',component:HomeComponent},
      { path: 'header',component:HeaderComponent},
      { path: 'github',component:GithubComponent},
      { path: 'jsonplaceholder',component:JsonplaceholderComponent},
      { path: 'carfirebase',component:CarfirebaseComponent},
      { path:'cars',component:CarsComponent}
    ]),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
