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
  t1:number = 34;

  poc1(){
    this.showherepoc = this.t1 * 2;
  }

  

}
