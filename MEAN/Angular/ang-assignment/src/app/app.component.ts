import { Component } from '@angular/core';
import { Sender } from './sender';
import { NodeArrayService } from './node-array.service';
import { Receiver } from './receiver';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ang-assignment';
  show;
  val:Sender;
  a = true;
  r = true;
  m = true;
  up = true;
  constructor(private sobj:NodeArrayService) {
    this.val = new Sender();
    this.val.numval = null;
    this.val.updval = null;
    this.val.oper = null;
  }

  // ajaxcall
  call(val:Sender) {
    this.sobj.ajaxCall(this.val).subscribe(
      (data:Receiver) => {
        this.show = data.arrayvalues;
        this.val.numval = null;
        this.val.updval = null;
        if (data.status == 1) {
          this.up = true;
          this.r = true;
          this.m = true;
          this.a = true;
        }
        if (data.status == 0) {
          this.a = true;
          this.r = true;
          this.m = true;
          this.up = true;
        }
      },
      (error) => {
        this.show = 'Error';
      }
    );
  }

  blur() {
    this.title = 'blur event';
    this.val.oper = 'blur';
    // let data = this.sobj.ajax(this.val);
    this.sobj.ajaxCall(this.val).subscribe(
      (data:Receiver) => {
        this.show = data.arrayvalues;
        
        if (data.status == 1) {
          this.up = false;
          this.r = false;
          this.m = false;
          this.a = true;
        }
        if (data.status == 0) {
          this.a = false;
          this.r = true;
          this.m = true;
          this.up = true;
        }
      },
      (error) => {
        this.show = 'Error';
      }
    );  
  }

  add() {
    this.title = 'Add event';
    this.val.oper = 'add';

    this.call(this.val);
  }

  remove() {
    this.title = 'Remove event';
    this.val.oper = 'remove';
    
    this.call(this.val);
  }

  modify() {
    this.title = 'Modify event';
    this.val.oper = 'modify';

    this.call(this.val);
  }

}
