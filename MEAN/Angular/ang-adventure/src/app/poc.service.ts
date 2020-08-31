import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PocService {

  constructor() { }

  f1(v1:number):number {
    return v1 - 3;
  }

}
