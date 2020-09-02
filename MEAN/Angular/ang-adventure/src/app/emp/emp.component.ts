import { Component, OnInit } from '@angular/core';
import { Empdetails } from '../empdetails';

@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css']
})
export class EmpComponent implements OnInit {

  run:string = 'woking.';
  employee:Empdetails;
  no:number;
  name:string;
  sal:number;
  constructor() {
    this.employee = new Empdetails();
    this.employee.empno = 1;
    this.employee.empname = 'cool name';
    this.employee.empsal = 1300000;
   }

  setdetail() {
    this.run = 'setdetails';
    

  }

  ngOnInit(): void {
  }

}
