import { Component, OnInit } from '@angular/core';
import { Emp } from '../emp';
import { NodeArrayService } from '../node-array.service';
import { EmpDetails } from '../emp-details';

@Component({
  selector: 'app-employee-db',
  templateUrl: './employee-db.component.html',
  styleUrls: ['./employee-db.component.css']
})
export class EmployeeDbComponent implements OnInit {

  title = 'Employee Db';
  msg:string;

  nm = true; mo = true; lo = true; a = true; m = true; r = true;
  em:Emp;
  emar:EmpDetails[]=[];

  constructor(private sobj:NodeArrayService) {
    this.em = new Emp();
    this.em.empid;
    this.em.empname;
    this.em.empmob;
    this.em.emploc;
  }
  // ajaxcall
  call(em:Emp) {
    console.log(em.oper);
    this.sobj.ajaxEmpCall(this.em).subscribe(
      (data:EmpDetails) => {
        this.emar = data.arr;
        // console.log(data.ed[0].empname);
        // console.log(data.status);
        if (data.status == 1) {
          this.nm = true; this.mo = true; this.lo = true;
          this.r = true; this.m = true; this.a = true;
          this.em.empid = null;
          this.em.empname = '';
          this.em.empmob = null;
          this.em.emploc = '';
        }
        if (data.status == 0) {
          this.msg = "OOPs.!!! Something happend";
        }
      },
      (error) => {
        this.msg = 'Error';
      }
    ); 
  }

  blur() {
    this.title = 'blur event';
    this.em.oper = 'blur';
    // let data = this.sobj.ajax(this.val);
    this.sobj.ajaxEmpCall(this.em).subscribe(
      (data:EmpDetails) => {
        this.emar = data.arr;
        // console.log(data.status);
        
        if (data.status == 1) {
          this.nm = false; this.mo = false; this.lo = false;
          this.r = false; this.m = false; this.a = true;
          this.em.empname = data.ed[0].empname;
          this.em.empmob = data.ed[0].mobileno;
          this.em.emploc = data.ed[0].location;
        }
        if (data.status == 0) {
          this.a = false; this.r = true; this.m = true;
          this.nm = false; this.mo = false; this.lo = false;
          this.em.empname = '';
          this.em.empmob = null;
          this.em.emploc = '';
        }
      },
      (error) => {
        this.msg = 'Error';
      }
    ); 
  }

  add() {
    this.title = 'add event';
    this.em.oper = 'add';

    this.call(this.em);
  }

  remove() {
    this.title = 'remove event';
    this.em.oper = 'remove';

    this.call(this.em);
  }

  modify() {
    this.title = 'modify event';
    this.em.oper = 'modify';

    this.call(this.em);
  }



  ngOnInit(): void {
  }

}
