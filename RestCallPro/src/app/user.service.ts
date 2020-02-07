import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  apiURL = 'http://jsonplaceholder.typicode.com/users/';

  constructor(private http: HttpClient) { 

  }
  getUserInfo():Observable<any> {
    console.log("///////////");
   return this.http.get(this.apiURL);
    
   }
}
