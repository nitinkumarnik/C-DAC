import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Logininfo } from './logininfo';
import { LogininfoFromServer } from './logininfo';
import { BehaviorSubject, Observable } from 'rxjs';
import { Search, SearchResult } from './search';


@Injectable({
  providedIn: 'root'
})
export class CsdbService {

  constructor(private htobj:HttpClient) { }


  private ES = new BehaviorSubject<any>('args');
  xyz = this.ES.asObservable();

  sharecomp(x:any) {
    console.log("x service --  " + x);
    this.ES.next(x);
  }



  ajaxLoginCall(inp:Logininfo):Observable<LogininfoFromServer> {
    let url:string = 'http://localhost:80/login';
    return this.htobj.post<LogininfoFromServer>(url, inp);
  }

  ajaxSearchCall(inp:Search):Observable<SearchResult> {
    let url:string = 'http://localhost:80/dblogic';
    return this.htobj.post<SearchResult>(url, inp);
  }

}
