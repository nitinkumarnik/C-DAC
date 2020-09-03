import { TestBed } from '@angular/core/testing';

import { NodeArrayService } from './node-array.service';

describe('NodeArrayService', () => {
  let service: NodeArrayService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NodeArrayService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
