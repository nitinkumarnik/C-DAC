import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'not-deam-app';
  cool = 'main hun, app.components.ts mai';
  showherepoc:number = 0;
  t1:number;
  num1:number;
  num2:number;
  resultshown:number = 0;
  poc1(){
    this.showherepoc = this.t1 * 2;
  }
  multiply(){
    this.resultshown = this.num1 * this.num2;
  }
  add(){
    this.resultshown = +this.num1 + +this.num2;
  }
  subs(){
    this.resultshown = this.num1 - this.num2;
  }

  

}
