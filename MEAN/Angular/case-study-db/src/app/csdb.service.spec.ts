import { TestBed } from '@angular/core/testing';

import { CsdbService } from './csdb.service';

describe('CsdbService', () => {
  let service: CsdbService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CsdbService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
