import { Component } from '@angular/core';
import { YService } from './y.service';
import { X } from './x';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ang-adventure';

  v1 = 8;
  v2 = 4;
  x = false;
  v3 = new X(); // model obj
  constructor(private ser:YService) {

  }

  basics() {
    this.v1 = 0;
    this.v2 = 0;
    this.x = true;
    // console.log("basics");
    // console.log(this);
  }

  callservicelayer() {
    this.v3.v1 = this.v1; // assiging value to obj prop
    this.v3.v2 = this.v2; // assiging value to obj prop
    this.title = 'Service Call ' + this.ser.f1(this.v3); // passing obj/model to service
  }

  opn() {
    this.title = 'one step closer to angular.';
    // console.log("opn");
    // console.log(this);
  }
 
}
