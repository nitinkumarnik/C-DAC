import { Component, OnInit } from '@angular/core';
import { Search, SearchResult } from '../search';
import { CsdbService } from '../csdb.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-search-options',
  templateUrl: './search-options.component.html',
  styleUrls: ['./search-options.component.css']
})
export class SearchOptionsComponent implements OnInit {

  isHidden = true;
  srch:Search;
  emar:SearchResult[]=[];
  resarr:any=[];
  constructor(private sobj: CsdbService,private router:Router) {
    this.srch = new Search();
    this.srch.empid;
    this.srch.firstName;
    this.srch.lastName;
    this.srch.dob;
    this.srch.doj;
    this.srch.grade;
    this.srch.oper;
  }

  search() {
    this.srch.oper = 'srchfn';
    this.sobj.ajaxSearchCall(this.srch).subscribe(
      (data:SearchResult) => {
        this.isHidden = false;
        this.emar = data.arr;
        this.resarr = data.arr;
        console.log(data);
      },
      (error) => {}
    );
  }

  hims(id:number) {
    console.log("hims clicked" + id);
    let res = [];
    // this.sobj.sharecomp(id);
    for (let j=0; j< this.resarr.length; j++) {
      if (id == this.resarr[j].empid) {
        res['eid'] = this.resarr[j].empid;
        res['fn'] = this.resarr[j].firstname;
        res['ln'] = this.resarr[j].lastname;
        res['dob'] = this.resarr[j].dob;
        res['doj'] = this.resarr[j].doj;
        res['grade'] = this.resarr[j].grade;
      }
    }
    console.log(res);
    this.sobj.sharecomp(res);
  }

  ngOnInit(): void {
  }

}
