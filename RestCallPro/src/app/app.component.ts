import { UserService } from './user.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'RestCallPro';
  myUsers:[]; 
  b:boolean;
  
  
  constructor(private api:UserService){
  this.b=false;
  console.log("b 1"+this.b);
  }

public loadUserInfo():any {
  return this.api.getUserInfo().subscribe((data:[]) => {
    this.myUsers = data;
    if(this.myUsers!=null || this.myUsers!=[]){
      this.b=true;
    }
    console.log("b 2"+this.b);
  })
}
refreshPage(){
  window.location.reload();
}

}
