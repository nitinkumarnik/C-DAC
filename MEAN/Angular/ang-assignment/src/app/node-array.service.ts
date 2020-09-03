import { Injectable } from '@angular/core';
import { Sender } from './sender';
import { Receiver } from './receiver';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Emp } from './emp';
import { EmpDetails } from './emp-details';

@Injectable({
  providedIn: 'root'
})
export class NodeArrayService {
  
  constructor(private htobj:HttpClient) { }

  ajax(inp:Sender):Receiver {
    let arr = [2, 3, 5, 6, 7];
    let re = new Receiver();
    re.status = 0;
    if (inp.oper == 'blur') {
      if (arr.includes(Number(inp.numval))) {
        re.status = 1;
        console.log(re.status);
      }
    }
    re.arrayvalues = arr;
    return re;
  }

  ajaxCall(inp:Sender):Observable<Receiver> {
    let url:string = 'http://localhost:80/arraylogic';
    return this.htobj.post<Receiver>(url, inp);
  }

  ajaxEmpCall(inp:Emp):Observable<EmpDetails>{
    let url:string = 'http://localhost:80/dblogic';
    // let sendit = JSON.stringify(inp);
    // console.log(sendit);
    // console.log(inp);
    return this.htobj.post<EmpDetails>(url, inp);
  }

}
