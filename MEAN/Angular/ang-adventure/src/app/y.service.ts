import { Injectable } from '@angular/core';

import { X } from './x';

@Injectable({
  providedIn: 'root'
})
export class YService {

  constructor() { }

  f1(temp:X):number {
    let result:number = 0;
    result = temp.v1 * temp.v2;
    return result;
  }

}
