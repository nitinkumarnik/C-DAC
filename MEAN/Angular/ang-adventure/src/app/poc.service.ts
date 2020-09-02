import { Injectable } from '@angular/core';
import { Rectangle } from './rectangle';
import { Rectresult } from './rectresult'
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PocService {

  constructor(private ajx:HttpClient) { }

  f1(v1:number):number {
    return v1 - 3;
  }

  area(rectmeasure:Rectangle) {
    return rectmeasure.bre * rectmeasure.len;
  }

  realAjax(r:Rectangle):Observable<Rectresult> {
    let url:any = "http://localhost:90/pocisimportant";
    // console.log("realAjax");
    return this.ajx.post<Rectresult>(url, r);
  }

  beforeAjax(r:Rectangle):Rectresult {
    let x:Rectresult = new Rectresult();
    if (r.len == 0 || r.bre == 0) {
      x.area = 0;
      x.perimeter = 0;
    } else {
      x.area = r.len * r.bre;
      x.perimeter = 2*( Number(r.len)+  Number(r.bre));
    }
    return x;
  }

}
