import { Component, OnInit } from '@angular/core';
import { Rectangle } from '../rectangle'
import { PocService } from '../poc.service';
import { Rectresult } from '../rectresult';

@Component({
  selector: 'app-rect',
  templateUrl: './rect.component.html',
  styleUrls: ['./rect.component.css']
})
export class RectComponent implements OnInit {

  title:string = 'rect-component';
  r:Rectangle;
  val1:number;
  val2:number;
  msg:any;
  constructor(private sref: PocService) {
    this.r = new Rectangle();
    this.r.len = 0; // this.val1;
    this.r.bre = 0; // this.val2;
   }

   servicecall() {
    this.title = 'service call';
    // this.r.len = this.val1;
    // this.r.bre = this.val2;
    // calling the service
    let resArea:any = this.sref.area(this.r);
    this.msg = 'The area is: ' + resArea;
  }


  ajaxcallnode() {
    this.title = 'ajax call node';
    this.sref.realAjax(this.r).subscribe(
      (data:Rectresult) => {
        if (data.area == 0) {
          this.msg = 'Nothing to calculate.';
        }
        else {
          this.msg = 'Area is ' + data.area +' and perimeter is '+ data.perimeter;
        }
      },
      (error) => {
        // this.msg = ('Ajax failed.');
        this.msg = JSON.stringify(error);
      }
    );
  }


  ajaxcall() {
    this.title = 'before ajax';
    
    let rr:Rectresult = this.sref.beforeAjax(this.r);
    if (rr.area == 0) {
      this.msg = 'nothing to calculate...';
    } else {
      this.msg = 'Area is ' + rr.area +' and perimeter is '+ rr.perimeter;
    }
    
  }

  ngOnInit(): void {
  }

}
