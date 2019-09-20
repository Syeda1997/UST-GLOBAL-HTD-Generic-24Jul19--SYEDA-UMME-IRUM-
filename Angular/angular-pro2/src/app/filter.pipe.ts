import { Pipe, PipeTransform } from '@angular/core';
import { User } from './users/user';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(users: User[], searchvalue:string): User[] {
    if(searchvalue===undefined) {
      return users;
    } else {
      return users.filter(data=>{
        return data.name.toLowerCase().includes(searchvalue.toLowerCase());
      });
    }
  }

}
