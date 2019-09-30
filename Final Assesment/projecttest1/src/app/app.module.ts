import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { TaskComponent } from './task/task.component';
import { PageComponent } from './page/page.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    UsersComponent,
    TaskComponent,
    PageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path:'',component:HomeComponent},
      { path:'users',component:UsersComponent},
      { path:'task',component:TaskComponent},
      { path:'**',component:PageComponent}
    ]),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
