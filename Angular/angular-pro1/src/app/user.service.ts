import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  users= [
    {
    name:'syeda',
    company:'UST'
    },
    {
        name:'umme',
        company:'TCS'
    },
    {
        name:'hadi',
        company:'mind tree'
    }];
  constructor() { }
}
