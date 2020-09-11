import { Component, OnInit } from '@angular/core';
import { CsdbService } from '../csdb.service';
import { Search, SearchResult } from '../search';


@Component({
  selector: 'app-modify-tab',
  templateUrl: './modify-tab.component.html',
  styleUrls: ['./modify-tab.component.css']
})
export class ModifyTabComponent implements OnInit {
 
  msg = '';
  srch:Search;
  emar:SearchResult[]=[];
  // resarr:any=[];
  constructor(private sobj: CsdbService) {
    this.srch = new Search();
    this.srch.empid;
    this.srch.firstName;
    this.srch.lastName;
    this.srch.dob;
    this.srch.doj;
    this.srch.grade;
    this.srch.oper;
  }
  
  modify() {
    this.srch.oper = 'modify';
    this.sobj.ajaxSearchCall(this.srch).subscribe(
      (data:SearchResult) => {
        this.msg = 'Updated.';
        // this.emar = data.arr;
        // this.resarr = data.arr;
        // console.log(data);
      },
      (error) => {
        this.msg = 'failed';
      }
    );
  }

  

  ngOnInit() {

    this.sobj.xyz.subscribe((x:any) => {

      this.srch.empid = x.eid;
      this.srch.firstName = x.fn;
      this.srch.lastName = x.ln;
      this.srch.dob = x.dob;
      this.srch.doj = x.don;
      this.srch.grade = x.grade;
      
    });
}
}
