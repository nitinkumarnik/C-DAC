import { Injectable } from '@angular/core';
import { Calctoserver } from './calctoserver';
import { Fromserver } from './fromserver';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CalcService {

  constructor(private htpob: HttpClient) { }

  ajaxCall(inp:Calctoserver):Observable<Fromserver> {
    let url:string = 'http://localhost:90/domaths';
    return this.htpob.post<Fromserver>(url , inp);
  }

}
