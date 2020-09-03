import { Component, OnInit } from '@angular/core';
import { Calctoserver } from '../calctoserver'
import { CalcService } from '../calc.service';
import { Fromserver } from '../fromserver';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  result:string;
  get:Calctoserver;
  constructor(private sref: CalcService) {
    this.get = new Calctoserver();
    this.get.v1 = 0;
    this.get.v2 = 0;
    this.get.oper = '*';
   }

  ngOnInit(): void {
  }

  domagic() {
    this.sref.ajaxCall(this.get).subscribe(
      (data:Fromserver) => {
        this.result = 'Msg: '+ data.msg + ' value: ' + data.value;
      },
      (error) => {
        this.result = 'Something happend.';
      }
    );

  }

}
