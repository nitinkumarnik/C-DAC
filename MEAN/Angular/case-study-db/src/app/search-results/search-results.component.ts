import { Component, OnInit } from '@angular/core';
import { CsdbService } from '../csdb.service';


@Component({
  selector: 'app-search-results',
  templateUrl: './search-results.component.html',
  styleUrls: ['./search-results.component.css']
})
export class SearchResultsComponent implements OnInit {

  id:any; fn:any; ln:any;
  dob:any; doj:any; grade:any;
  
  
  constructor(private sobj:CsdbService) { }

  

  ngOnInit() {
    // this.smval = this.ar.snapshot.params.it.empid;
    // console.log(this.ar.snapshot.params.prop);
    this.sobj.xyz.subscribe((x:any) => {
      this.id = x.eid; this.fn = x.fn; this.ln = x.ln;
      this.dob = x.dob; this.doj = x.doj; this.grade = x.grade;
      
    });
  }

}
